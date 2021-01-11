package com.apps.bmkgnotev3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Siang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siang);
        BottomNavigationView bottomNavigationView = findViewById(R.id.btm_menu);
        bottomNavigationView.setSelectedItemId(R.id.siang);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.pagi:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.siang:
                        return true;
                    case R.id.malam:
                        startActivity(new Intent(getApplicationContext(),Malam.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}