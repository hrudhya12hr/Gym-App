package com.example.gymapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Signup extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7,e8;
    AppCompatButton b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        e1=(EditText) findViewById(R.id.name);
        e2=(EditText) findViewById(R.id.age);
        e3=(EditText) findViewById(R.id.hname);
        e4=(EditText) findViewById(R.id.pincod);
        e5=(EditText) findViewById(R.id.mob);
        e6=(EditText) findViewById(R.id.username);
        e7=(EditText) findViewById(R.id.password);
        e8=(EditText) findViewById(R.id.confpass);

        b1=(AppCompatButton) findViewById(R.id.registerbt);
        b2=(AppCompatButton) findViewById(R.id.backtologin);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getPatientName= e1.getText().toString();
                String getAge= e2.getText().toString();
                String getHouseName= e3.getText().toString();
                String getPin= e4.getText().toString();
                String getMobNo= e5.getText().toString();
                String getUsername= e6.getText().toString();
                String getPassword= e7.getText().toString();
                String getConfirmPass= e8.getText().toString();

                Toast.makeText(getApplicationContext(),getPatientName+getAge+" " +getHouseName+" "+getPin+" "+getMobNo+" "+getUsername+" "+getPassword+" "+getConfirmPass,Toast.LENGTH_SHORT).show();

            }
        });

    }
}