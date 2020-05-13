package com.example.tugasakb.fragment;

// 11 Mei 2020 ~ 10117206 Zulfan Nurrahman IF7

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.tugasakb.R;

public class FragmentFriends extends Fragment {

    int _id;
    String _name;
    String _email;
    String _phone;

    public FragmentFriends() {

    }

    public FragmentFriends(int _id, String _name, String _email, String _phone) {
        this._id = _id;
        this._name = _name;
        this._email = _email;
        this._phone = _phone;
    }

    public FragmentFriends(String _name, String _email, String _phone) {
        this._name = _name;
        this._email = _email;
        this._phone = _phone;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_phone() {
        return _phone;
    }

    public void set_phone(String _phone) {
        this._phone = _phone;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_friends, container, false);
    }
}
