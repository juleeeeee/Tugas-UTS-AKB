package com.example.tugasakb;

// 10 Mei 2020 ~ 10117206 Zulfan Nurrahman IF7

import android.os.Bundle;
import android.view.MenuItem;

import com.example.tugasakb.fragment.FragmentContact;
import com.example.tugasakb.fragment.FragmentFriends;
import com.example.tugasakb.fragment.FragmentProfile;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager_view);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_tabLayout_view);

        SimpleViewPager sp = new SimpleViewPager(getSupportFragmentManager());

        viewPager.setAdapter(sp);

        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentProfile()).commit();
                break;
            case R.id.nav_contact:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentContact()).commit();
                break;
            case R.id.nav_friends:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentFriends()).commit();
                break;
            case R.id.nav_add_friend:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AddActivity()).commit();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}