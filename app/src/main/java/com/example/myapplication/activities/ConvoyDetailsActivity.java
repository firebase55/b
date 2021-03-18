package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class ConvoyDetailsActivity extends AppCompatActivity {

    private ImageView ivBack;
    private TextView tvConvoyName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convoy_details);

        ivBack = findViewById(R.id.iv_back_convoy_details);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tvConvoyName = findViewById(R.id.tv_convoy_name);
    }
}