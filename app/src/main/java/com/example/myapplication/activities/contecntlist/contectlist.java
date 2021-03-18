package com.example.myapplication.activities.contecntlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;
import com.example.myapplication.activities.HomeActivity;

public class contectlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contectlist);
    }

    public void mainpage(View view) {
        Intent map = new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(map);
    }
}