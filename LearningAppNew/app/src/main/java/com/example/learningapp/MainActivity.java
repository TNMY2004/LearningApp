package com.example.learningapp;

import static androidx.navigation.ui.NavigationUI.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.learningappnew.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_Navigation);
        NavController navController = Navigation.findNavController(this, R.id.main_fragment);
       NavigationUI.setupWithNavController(bottomNavigationView, navController);


    }
}