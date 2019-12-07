package com.mungziapp.traveltogether.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mungziapp.traveltogether.ActivityCallback;
import com.mungziapp.traveltogether.R;

public class DiaryFragment extends Fragment {
    private ActivityCallback callback;

    @Override
    public void setMenuVisibility(boolean menuVisible) {
        super.setMenuVisibility(menuVisible);

        if (menuVisible && callback != null)
            callback.setFragmentTitle("일기");
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if (context instanceof ActivityCallback)
            callback = (ActivityCallback) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_diary, container, false);

        return rootView;
    }
}