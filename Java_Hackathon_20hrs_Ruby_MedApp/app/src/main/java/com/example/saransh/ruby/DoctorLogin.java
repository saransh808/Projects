package com.example.saransh.ruby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class DoctorLogin extends AppCompatActivity {

    public static final String EEE = "saransh";
    public static String ss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_login);




    }


    public void doctorlogin(View view) {


        Intent intent = new Intent(this, DoctorContinue.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message01 = editText.getText().toString();
        intent.putExtra(EEE, message01);
        if(editText.getText().toString().length()==0)
            editText.setError("Field Empty");
        else
            startActivity(intent);
    }
}
