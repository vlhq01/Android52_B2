package com.example.android52_b2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtsu,txtphone;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtsu = findViewById(R.id.txtSu);
        txtphone = findViewById(R.id.editTextTextPersonName);
        login = findViewById(R.id.btnlogin);
        txtsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(MainActivity.this,SignUpActivity.class) ;
                startActivity(action);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class) ;
                intent.putExtra("phone",txtphone.getText().toString());

                startActivity(intent);
            }
        });
    }
}