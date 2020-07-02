package com.example.t1counter_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.ProgressDialog.show;
import static com.example.t1counter_app.R.id.Zero;

public class MainActivity<_0> extends AppCompatActivity {
    Button buttonPlus;
    Button buttonMinus;
    Button buttonReset;
    Button buttonToast;
    TextView _0;
    int counter=0;
    private View.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            switch(view.getId()){
                case R.id.buttonMinus :
                    minusCounter();
                    break;
                case R.id.buttonPlus :
                    plusCounter();
                    break;
                case R.id.buttonReset :
                    initCounter();
                    break;
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        buttonPlus = findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(clickListener);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(clickListener);
        buttonReset = findViewById(R.id.buttonReset);
        buttonReset.setOnClickListener(clickListener);
        buttonToast = findViewById(R.id.buttonToast);
        //btnToast.setOnClickListener(clickListener);
        _0=(TextView) findViewById(Zero);

        initCounter();

        if (savedInstanceState!=null){
            
            String s =savedInstanceState.getString("some");
            _0.setText(s);
        }
    }

    private void initCounter() {
        counter = 0;
        _0.setText(""+counter);
    }
    private void plusCounter() {
        counter++;
        _0.setText(""+counter);
    }
    private void minusCounter() {
        counter--;
        _0.setText(""+counter);
    }
    public void display(View view) {
        Toast.makeText(getApplicationContext(), "Your count is"+counter,Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("some",_0.getText().toString());

    }

}