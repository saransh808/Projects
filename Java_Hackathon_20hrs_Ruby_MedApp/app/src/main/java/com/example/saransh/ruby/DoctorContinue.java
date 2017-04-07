package com.example.saransh.ruby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;

public class DoctorContinue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_continue);


        TextView textView111 = (TextView) findViewById(R.id.textView13);
        textView111.setText(" " + PatientLogin.ss);
    }






}

