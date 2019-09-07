package com.example.homew2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.homew2.model.Auth;

public class MainActivity extends AppCompatActivity {
    private static final String EMAIL = "ken@hotmail.com"; //**
    private static final String PASSWORD = "123456"; //**

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText emailEditText = findViewById(R.id.email_edit_text); ///**
                EditText passwordEditText = findViewById(R.id.password_edit_text); //**
                CheckBox rememberpasswordcheakbox = findViewById(R.id.remember_password_checkBox);

                String inputEmail = emailEditText.getText().toString(); //**
                Integer.parseInt( inputEmail);
                String iputpassword = passwordEditText.getText().toString();//วิธีเก็บข้อมูลอีเมลกับพาสเวิร์ดลงในช่อง**

                Auth auth = new Auth(inputEmail, iputpassword);
                /*auth.setmEmail(inputEmail);
                auth.setmEmail(iputpassword);*/
                boolean result = auth.check();
                if (result==true) {
                    //login สำเร็จ
                    /*Toast.makeText(MainActivity.this, R.string.login_success, Toast.LENGTH_SHORT).show();*/
                    if(rememberpasswordcheakbox.isChecked()){
                        Toast.makeText(MainActivity.this,"คุณเลือกจำรหัสผ่าน",Toast.LENGTH_SHORT).show();
                    }
                } else {
                    //login ไม่สำเร็จ
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage(R.string.login_failed);
                    dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.setNegativeButton("cacel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.setNeutralButton("Ignore", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();
                }
                //  Toast t = Toast.makeText(LoginActivity1.this,"Hello",Toast.LENGTH_SHORT);
            }
        });
    }
}

