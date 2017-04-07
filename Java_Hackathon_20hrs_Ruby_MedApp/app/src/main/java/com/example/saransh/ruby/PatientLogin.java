package com.example.saransh.ruby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PatientLogin extends AppCompatActivity {
    public static final String EE = "saransh";
    public static String ss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_login);
    }


    public void continuePatient(View view) {
        Intent intent = new Intent(this, PatientContinue.class);
        EditText editText = (EditText) findViewById(R.id.editText3);
        String message1 = editText.getText().toString();
        //
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String message2 = editText2.getText().toString();
        ss = message2;
        //
        EditText editText3 = (EditText) findViewById(R.id.editText4);
        String message3 = editText3.getText().toString();

        intent.putExtra(EE, message1);
        if(editText.getText().toString().length()==0){
            editText.setError("Field Empty");
            if(editText3.getText().toString().length()==0){

                editText3.setError("Field Empty");
            }

        }
        else{
            startActivity(intent);
        }
    }
}
