package com.mungziapp.traveltogether.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.kakao.network.ErrorResult;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.LogoutResponseCallback;
import com.kakao.usermgmt.callback.UnLinkResponseCallback;
import com.mungziapp.traveltogether.R;
import com.mungziapp.traveltogether.ServerService;
import com.mungziapp.traveltogether.app.GalleryImageSetter;
import com.mungziapp.traveltogether.app.TokenManager;

public class SettingsActivity extends BaseActivity {
	private static final String TAG = "Settings :: ";
	private static final int NORMAL_MODE = 0;
	private static final int EDIT_MODE = 1;
	private static final int PICK_FROM_ALBUM = 101;

	private int mode = NORMAL_MODE;
	private InputMethodManager in;

	private Button btnEdit;
	private Button btnGoBefore;
	private Button btnCancel;
	private LinearLayout buttons;

	private ImageView profileImg;
	private TextView profileName;
	private TextView profileMessage;
	private EditText editName;
	private EditText editMessage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);

		setButtons();
		init();
	}

	private void init() {
		profileName.setText("김예지");
		profileMessage.setText("상태 메시지");
	}

	private void setButtons() {
		btnEdit = findViewById(R.id.btn_edit);
		btnEdit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (mode == NORMAL_MODE) {
					setEditMode();

					editName.setText(profileName.getText().toString());
					editMessage.setText(profileMessage.getText().toString());
				}
				else {
					setNormalMode();

					profileName.setText(editName.getText().toString());
					profileMessage.setText(editMessage.getText().toString());
				}
			}
		});

		btnGoBefore = findViewById(R.id.btn_go_before);
		btnGoBefore.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();
			}
		});

		Button btnLogout = findViewById(R.id.btn_logout);
		btnLogout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				onClickLogout();
			}
		});

		Button btnRemoveAccount = findViewById(R.id.btn_remove_account);
		btnRemoveAccount.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				onClickUnlink();
			}
		});

		btnCancel = findViewById(R.id.btn_cancel);
		btnCancel.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (!profileMessage.getText().toString().equals(editMessage.getText().toString())
						|| !profileName.getText().toString().equals(editName.getText().toString())) {
					hideKeyboard();
					new AlertDialog.Builder(SettingsActivity.this)
							.setMessage(getString(R.string.cancel_message))
							.setPositiveButton(getString(R.string.btn_ok_text), new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialogInterface, int i) {
									setNormalMode();
								}
							})
							.setNegativeButton(getString(R.string.btn_cancel_text), new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialogInterface, int i) {
									dialogInterface.dismiss();
								}
							}).show();
				}
				else
					setNormalMode();
			}
		});

		profileImg = findViewById(R.id.profile_img);
		profileImg.setOnClickListener(new View.OnClickListener() {
			String[] options = getResources().getStringArray(R.array.option_profile_img);

			@Override
			public void onClick(View view) {
				switch (mode) {
					case EDIT_MODE:
						hideKeyboard();
						new AlertDialog.Builder(SettingsActivity.this)
								.setTitle(getString(R.string.profile_img))
								.setItems(options, new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface dialogInterface, int i) {
										switch (i) {
											case 0:
												Toast.makeText(SettingsActivity.this, "기본 이미지로 변경", Toast.LENGTH_SHORT).show();
												break;
											case 1:
												Intent intent = new Intent(Intent.ACTION_PICK);
												intent.setType(MediaStore.Images.Media.CONTENT_TYPE);
												startActivityForResult(intent, PICK_FROM_ALBUM);
												break;
										}
									}
								}).show();
						break;
					case NORMAL_MODE:
						startActivity(new Intent(SettingsActivity.this, PhotoViewActivity.class));
						break;
				}
			}
		});

		profileName = findViewById(R.id.text_name);
		profileMessage = findViewById(R.id.text_message);
		editName = findViewById(R.id.edit_name);
		editMessage = findViewById(R.id.edit_message);
		buttons = findViewById(R.id.buttons);

		in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		if (requestCode == PICK_FROM_ALBUM && data != null)
			profileImg.setImageBitmap(new GalleryImageSetter().getBitmapFromIntent(data, SettingsActivity.this));
	}

	private void setNormalMode() {
		mode = NORMAL_MODE;

		btnGoBefore.setVisibility(View.VISIBLE);
		btnCancel.setVisibility(View.INVISIBLE);

		String strEdit = "Edit";
		btnEdit.setText(strEdit);

		buttons.setVisibility(View.VISIBLE);

		profileName.setVisibility(View.VISIBLE);
		profileMessage.setVisibility(View.VISIBLE);
		editName.setVisibility(View.GONE);
		editMessage.setVisibility(View.GONE);

		hideKeyboard();
	}

	private void setEditMode() {
		mode = EDIT_MODE;

		btnGoBefore.setVisibility(View.INVISIBLE);
		btnCancel.setVisibility(View.VISIBLE);

		String strSave = "Save";
		btnEdit.setText(strSave);

		buttons.setVisibility(View.INVISIBLE);

		profileName.setVisibility(View.GONE);
		profileMessage.setVisibility(View.GONE);
		editName.setVisibility(View.VISIBLE);
		editMessage.setVisibility(View.VISIBLE);

		hideKeyboard();
	}

	private void hideKeyboard() {
		editName.clearFocus();
		editMessage.clearFocus();

		if (in != null)
			in.hideSoftInputFromWindow(editName.getWindowToken(), 0);
	}

	private void onClickLogout() {
		new AlertDialog.Builder(SettingsActivity.this)
				.setMessage(getString(R.string.logout_message))
				.setPositiveButton(getString(R.string.btn_ok_text), new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialogInterface, int i) {
						UserManagement.getInstance().requestLogout(new LogoutResponseCallback() {
							@Override
							public void onCompleteLogout() {
								removeRefreshToken();
								stopServerService();
								Log.d(TAG, "onCompleteLogout");
								redirectLoginActivity();
							}
						});
					}
				})
				.setNegativeButton(getString(R.string.btn_cancel_text), new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialogInterface, int i) {
						dialogInterface.dismiss();
					}
				}).show();
	}

	private void onClickUnlink() {
		final String appendMessage = getString(R.string.com_kakao_confirm_unlink);
		new AlertDialog.Builder(SettingsActivity.this)
				.setMessage(appendMessage)
				.setPositiveButton(getString(R.string.com_kakao_ok_button),
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								UserManagement.getInstance().requestUnlink(new UnLinkResponseCallback() {
									@Override
									public void onFailure(ErrorResult errorResult) {
										Log.e(TAG, errorResult.toString());
									}

									@Override
									public void onSessionClosed(ErrorResult errorResult) {
										Log.d(TAG, "onSessionClosed");
										redirectLoginActivity();
									}

									@Override
									public void onNotSignedUp() {
										Log.d(TAG, "onNotSignedUp");
										redirectLoginActivity();
									}

									@Override
									public void onSuccess(Long userId) {
										removeRefreshToken();
										stopServerService();
										Log.d(TAG, "onSuccess Unlink");
										redirectLoginActivity();
									}
								});
								dialog.dismiss();
							}
						})
				.setNegativeButton(getString(R.string.com_kakao_cancel_button),
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								dialog.dismiss();
							}
						}).show();
	}

	private void removeRefreshToken() {
		SharedPreferences prefs = getSharedPreferences(TokenManager.prefFileName, MODE_PRIVATE);
		SharedPreferences.Editor editor = prefs.edit();
		editor.remove(TokenManager.refreshToken).apply();

		Log.d(TAG, "refresh token remove.");
	}

	private void stopServerService() {
		stopService(new Intent(SettingsActivity.this, ServerService.class));
	}
}
