package com.example.forgot_password;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    //private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ChipNavigationBar chipNavigationBar = findViewById(R.id.bottom);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom);
        openFragment(HomeFragment.newInstance("", ""));
    }

    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

        BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fpbm_id:
                                openFragment(HomeFragment.newInstance("", ""));
                                return true;
                            case R.id.otpbm_id:
                                openFragment(OTPFragment.newInstance("", ""));
                                return true;
                            case R.id.spinnerbm_id:
                                openFragment(SpinnerFragment.newInstance("", ""));
                                return true;
                        }
                        return false;
                        //return false;
                    }
                };


            }

//        chipNavigationBar.setItemSelected(R.id.fpbm_id, true);
//        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
//
//        chipNavigationBar.setOnItemSelectedListener(new com.ismaeldivita.chipnavigation.ChipNavigationBar.OnItemSelectedListener() {
//            @SuppressLint("NonConstantResourceId")
//            @Override
//            public void onItemSelected(int i) {
//                switch (i) {
//                    case R.id.fpbm_id:
//                        fragment = new HomeFragment();
//                        break;
//                    case R.id.otpbm_id:
//                        fragment = new OTPFragment();
//                        break;
//                    case R.id.spinnerbm_id:
//                        fragment = new SpinnerFragment();
//                        break;
//
//                }
//
//                if (fragment != null) {
//                    getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
//                }
//            }
//        });
