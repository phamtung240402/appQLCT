package com.example.qlct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView mBottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView() {
        mBottomNavigationView = findViewById(R.id.bottomNagivationView);
        mBottomNavigationView.setBackground(null);
    }
<<<<<<< HEAD

=======
    
>>>>>>> 2c32a2da8f6f27baf2538a4729eb7ed4f19cb47b
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 2c32a2da8f6f27baf2538a4729eb7ed4f19cb47b
