package com.example.R;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    EditText et1;
    EditText et2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aregister);
        et1=findViewById(R.id.name);
        et2=findViewById(R.id.password);
        b1=findViewById(R.id.Register);

    }
    public void Register(View view) {
        Toast.makeText(this, "Registration Successful!", Toast.LENGTH_LONG).show();


    }


}