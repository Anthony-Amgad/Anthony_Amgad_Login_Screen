package com.anthony.zatur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginScreen extends AppCompatActivity implements View.OnClickListener {

    ImageView passShowEye;
    AppCompatButton loginBtn;
    EditText passwordTxt, usernameTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        usernameTxt = findViewById(R.id.usernametxt);
        passwordTxt = findViewById(R.id.passwordtxt);

        loginBtn = findViewById(R.id.loginbtn);
        loginBtn.setOnClickListener(this);

        passShowEye = findViewById(R.id.passshoweye);
        passShowEye.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v.equals(passShowEye)){
            if(passwordTxt.getTransformationMethod() == PasswordTransformationMethod.getInstance())
                passwordTxt.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            else
                passwordTxt.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }else if(v.equals(loginBtn)){
            Intent intent = new Intent(this,ProfileScreen.class);
            intent.putExtra("username",String.valueOf(usernameTxt.getText()));
            intent.putExtra("password",String.valueOf(passwordTxt.getText()));
            startActivity(intent);
        }
    }
}