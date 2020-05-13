package com.example.tugasakb.fragment;

// 11 Mei 2020 ~ 10117206 Zulfan Nurrahman IF7

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.tugasakb.R;

public class FragmentContact extends Fragment {

    public FragmentContact() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }
}
