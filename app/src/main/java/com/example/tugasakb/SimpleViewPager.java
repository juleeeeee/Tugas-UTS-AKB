package com.example.tugasakb;

// 10 Mei 2020 ~ 10117206 Zulfan Nurrahman IF7

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.tugasakb.fragment.FragmentProfile;
import com.example.tugasakb.fragment.FragmentContact;
import com.example.tugasakb.fragment.FragmentFriends;

public class SimpleViewPager extends FragmentStatePagerAdapter {

    public SimpleViewPager(FragmentManager fm){
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new FragmentProfile();
            case 1 : return new FragmentContact();
            case 2 : return new FragmentFriends();
            default: return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0 : return "Profile";
            case 1 : return "Contact Me";
            case 2 : return "Friend List";
            default : return "no";
        }
    }
}
