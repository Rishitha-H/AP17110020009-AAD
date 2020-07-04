package com.example.R;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alogin);

        String S=getIntent().getStringExtra("mydata");
        TextView tv = findViewById(R.id.alohaid);
        tv.setText("Welcome, "+S+" :)");

    }
}