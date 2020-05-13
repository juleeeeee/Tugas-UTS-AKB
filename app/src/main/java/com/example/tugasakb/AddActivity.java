package com.example.tugasakb;

// 13 Mei 2020 ~ 10117206 Zulfan Nurrahman IF7

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class AddActivity extends Fragment {

    public AddActivity() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_add, container, false);
    }
}