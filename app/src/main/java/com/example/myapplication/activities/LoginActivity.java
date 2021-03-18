package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.activities.maplocation.MapsActivity;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

import javax.microedition.khronos.egl.EGLDisplay;

public class LoginActivity extends AppCompatActivity {
    private TextView mRegisterNow, login_text;
//    private EditText login, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        login = (EditText) findViewById(R.id.mobile_id);
//        pass = (EditText) findViewById(R.id.pass_id);
        login_text = (TextView) findViewById(R.id.tv_login);
//        login_text.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String loginField = login.getText().toString().trim();
//                String passField = pass.getText().toString().trim();
//                if (loginField.isEmpty() || passField.isEmpty()) {
//                    Toast.makeText(LoginActivity.this, "please fill the fileds", Toast.LENGTH_SHORT).show();
//                }
//                if (loginField.isEmpty() && passField.isEmpty()) {
//                    Toast.makeText(LoginActivity.this, "please fill boths  fileds", Toast.LENGTH_SHORT).show();
//                } else {
//                    loginFunction();
//                }
//            }
//        });
//
//
//    }
//
//    private void loginFunction() {
//        Toast.makeText(this, "firebase function", Toast.LENGTH_SHORT).show();
//
//    }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void login(View view)
    {
        Intent intent = new Intent(getApplicationContext(),OTPActivity.class);
        startActivity(intent);

    }

    public void reg(View view)
    {
        Intent map = new Intent(getApplicationContext(), RegisterActivity.class);
        startActivity(map);
    }
}