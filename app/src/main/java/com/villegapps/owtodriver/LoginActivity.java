package com.villegapps.owtodriver;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by john.villegas on 16/10/2017.
 */

public class LoginActivity extends AppCompatActivity {
    @Bind(R.id.image_owto)
    ImageView imageOwto;
    @Bind(R.id.editText_name)
    EditText editTextName;
    @Bind(R.id.textInputLayout_name)
    TextInputLayout textInputLayoutName;
    @Bind(R.id.editText_password)
    EditText editTextPassword;
    @Bind(R.id.linear_user_credentials)
    LinearLayout linearUserCredentials;
    @Bind(R.id.button_login)
    Button buttonLogin;
    @Bind(R.id.button_signup)
    Button buttonSignup;
    @Bind(R.id.button_forgot)
    Button buttonForgot;
    @Bind(R.id.activity_login)
    RelativeLayout activityLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button_login, R.id.button_signup, R.id.button_forgot})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button_login:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.button_signup:
                break;
            case R.id.button_forgot:
                break;
        }
    }
}
