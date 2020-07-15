package com.example.t6;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;


public class MainActivity extends AppCompatActivity  {
    EditText rollno,name,mobile,emailid,password,branch;
    RadioButton male,female,other;
    String gender;
    Button submit;
    AwesomeValidation awesomeValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollno=findViewById(R.id.editTextRollnum);
        name=findViewById(R.id.editTextUsername);
        mobile=findViewById(R.id.editTextNumber);
        emailid=findViewById(R.id.editTextEmail);
        password=findViewById(R.id.editTextPassword);
        male=findViewById(R.id.Male);
        female=findViewById(R.id.Female);
        other=findViewById(R.id.Other);
        branch=findViewById(R.id.editTextBranch);
        submit =  findViewById(R.id.bsubmit);


        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        awesomeValidation.addValidation(this, R.id.editTextUsername, RegexTemplate.NOT_EMPTY, R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.editTextEmail, Patterns.EMAIL_ADDRESS, R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.editTextNumber, "^[2-9]{2}[0-9]{8}$", R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.editTextPassword, ".{8,}", R.string.passworderror);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (awesomeValidation.validate()) {
                    Toast.makeText(getApplicationContext(),"Form Validated Sucessfully", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Form Validation Failed", Toast.LENGTH_LONG).show();
                }
                submitForm();

            }

        });
    }

    private void submitForm() {

        String S1 = rollno.getText().toString();
        String S2 = name.getText().toString();
        String S3 = mobile.getText().toString();
        String S4= emailid.getText().toString();
        String S5=password.getText().toString();
        String S6=branch.getText().toString();
        if(male.isChecked()){
            gender = male.getText().toString();
        }
        else if(female.isChecked()){
            gender = female.getText().toString();
        }
        else if(female.isChecked()){
            gender = other.getText().toString();
        }

        setContentView(R.layout.profile);

        TextView tv;
        tv=findViewById(R.id.View);
        tv.setText("Roll Number : "+S1+"\n"+"Username : "+S2+"\n"+"Mobile Number : "+S3+"\n"+"Email : "+S4+"\n"+"Password : "+S5+"\n"
                +"Gender : "+gender+"\n"+"Branch : "+S6+"\n");



    }



}