package com.example.android52_b2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    EditText edtphone,edtname,edtemail,edtpassword;
    Button btnsu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);


        edtphone = findViewById(R.id.editTextTextPersonphone);
        edtname = findViewById(R.id.editTextTextPersonName);
        edtemail = findViewById(R.id.editTextTextPersonEmail);
        edtpassword = findViewById(R.id.editTextTextPersonPassword);
        btnsu = findViewById(R.id.btnsignup);
        SharedPreferences sharedPreferences = this.getSharedPreferences("My preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.commit();
        editor.putString("name" , edtname.getText().toString());
        editor.putString("email" , edtname.getText().toString());
        editor.putString("password" , edtname.getText().toString());
        editor.putString("phone" , edtname.getText().toString());
        btnsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
