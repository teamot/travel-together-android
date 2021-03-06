package com.mungziapp.traveltogether.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mungziapp.traveltogether.R;
import com.mungziapp.traveltogether.adapter.CheckMembersAdapter;
import com.mungziapp.traveltogether.app.helper.DatabaseHelper;
import com.mungziapp.traveltogether.model.table.TravelTable;

public class CheckMemberActivity extends AppCompatActivity {
	private int numOfMembers;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check_member);

		Intent intent = getIntent();
		if (intent != null) {
			setDataFromDB(intent.getStringExtra("travel_id"));
			setButtons();
			setRecyclerView();
		}
	}

	private void setDataFromDB(String travelId) {
		Cursor cursor = DatabaseHelper.database.rawQuery(TravelTable.SELECT_QUERY + " WHERE id = '" + travelId + "'", null);
		cursor.moveToNext();

		this.numOfMembers = cursor.getInt(cursor.getColumnIndex("members"));

		cursor.close();
	}

	private void setButtons() {
		TextView members = findViewById(R.id.num_of_members);
		members.setText(String.valueOf(numOfMembers));

		Button btnGoBefore = findViewById(R.id.btn_go_before);
		btnGoBefore.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();
			}
		});

		TextView inviteKakao = findViewById(R.id.invite_for_kakao);
		inviteKakao.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(CheckMemberActivity.this, "카카오톡으로 이동", Toast.LENGTH_SHORT).show();
			}
		});
	}

	private void setRecyclerView() {
		RecyclerView memberRecycler = findViewById(R.id.member_recycler_view);
		memberRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

		CheckMembersAdapter membersAdapter = new CheckMembersAdapter(CheckMemberActivity.this);
		membersAdapter.initItem(numOfMembers);
		membersAdapter.setOnImageClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(CheckMemberActivity.this, PhotoViewActivity.class));
			}
		});

		memberRecycler.setAdapter(membersAdapter);
	}
}
