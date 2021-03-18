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
import com.example.myapplication.activities.settergetter.setterclass;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.concurrent.TimeUnit;

public class RegisterActivity extends AppCompatActivity {
//    private FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
//    private DatabaseReference mDatabaseReference = mDatabase.getReference();
//    private EditText name, mobile, pass, conform_pass;
//    private TextView registered_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
//        name = (EditText) findViewById(R.id.name_id);
//        mobile = (EditText) findViewById(R.id.mobile_id);
//        pass = (EditText) findViewById(R.id.pass_id);
//        conform_pass = (EditText) findViewById(R.id.conform_id);
//        registered_button = (TextView) findViewById(R.id.tv_login);
//        registered_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getStringfunction();
//            }
//        });
//
//
//    }
//
//    private void getStringfunction() {
//        String namefield = name.getText().toString().trim();
//        String mobilefeld = mobile.getText().toString().trim();
//        String passfield = pass.getText().toString().trim();
//        String conformfield = conform_pass.getText().toString().trim();
//        if (namefield.isEmpty() && mobilefeld.isEmpty() && passfield.isEmpty() && conformfield.isEmpty()) {
//            Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
//        } else {
//
//        }
//        if (namefield.isEmpty() || mobilefeld.isEmpty() || passfield.isEmpty() || conformfield.isEmpty()) {
//            Toast.makeText(this, "Please fill the fileds", Toast.LENGTH_SHORT).show();
//
//        } else {
//            mDatabase = FirebaseDatabase.getInstance();
//            mDatabaseReference = mDatabase.getReference().child("users");
//            setterclass user = new setterclass(namefield, mobilefeld, passfield, conformfield);
//            mDatabaseReference = mDatabase.getReference().child("user");
//            mDatabaseReference.setValue(user);
//        }
//

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}