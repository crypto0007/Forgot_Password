package com.example.forgot_password;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {
    private Fragment fragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChipNavigationBar chipNavigationBar = findViewById(R.id.bottom);

        chipNavigationBar.setItemSelected(R.id.fpbm_id, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();

        chipNavigationBar.setOnItemSelectedListener(new com.ismaeldivita.chipnavigation.ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                switch (i) {
                    case R.id.fpbm_id:
                        fragment = new HomeFragment();
                        break;
                    case R.id.otpbm_id:
                        fragment = new OTPFragment();
                        break;
                    case R.id.spinnerbm_id:
                        fragment = new SpinnerFragment();
                        break;

                }

                if (fragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
                }
            }
        });
    }
}