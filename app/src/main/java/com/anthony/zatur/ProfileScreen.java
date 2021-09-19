package com.anthony.zatur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileScreen extends AppCompatActivity {

    TextView passworTxt, usernamTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);

        Intent intent = getIntent();

        passworTxt = findViewById(R.id.passwortxt);
        usernamTxt = findViewById(R.id.usernamtxt);

        usernamTxt.setText(intent.getStringExtra("username"));
        passworTxt.setText(intent.getStringExtra("password"));
    }
}