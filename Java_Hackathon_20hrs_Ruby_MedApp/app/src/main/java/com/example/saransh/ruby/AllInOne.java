package com.example.saransh.ruby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class AllInOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_in_one);
    }

    public void practo(View view){
        Intent i = new Intent(this, Practo.class);
        startActivity(i);
    }

    public void webmd(View view){
        Intent i = new Intent(this, WebMd.class);
        startActivity(i);
    }


    public void one_mg(View view){
        Intent ii = new Intent(this, One_mg.class);
        startActivity(ii);
    }

    public void health_kart(View view){
        Intent i = new Intent(this, HealthKart.class);
        startActivity(i);
    }

    public void Yahoohealth(View view){
        Intent i=new Intent(this,Yahoo.class);
        startActivity(i);
    }

}
