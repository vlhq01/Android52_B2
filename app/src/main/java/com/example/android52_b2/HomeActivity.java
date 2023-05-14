package com.example.android52_b2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity  extends AppCompatActivity {
    TextView txtname,txtemail,txtpassword,txtphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        txtname = findViewById(R.id.txtname);
        txtemail = findViewById(R.id.txtemail);
        txtpassword = findViewById(R.id.txtpassword);
        txtphone = findViewById(R.id.txtpassword);
        Intent intent = getIntent();
        String phonenumber = intent.getStringExtra("phone");
        SharedPreferences sharedPreferences = this.getSharedPreferences("My preferences", this.MODE_PRIVATE);
        String phone = sharedPreferences.getString("phone","");
        if(phonenumber == phone){
            txtname.setText(sharedPreferences.getString("name",""));
            txtemail.setText(sharedPreferences.getString("email",""));
            txtpassword.setText(sharedPreferences.getString("password",""));
            txtphone.setText(phone);
        }
    }

}
