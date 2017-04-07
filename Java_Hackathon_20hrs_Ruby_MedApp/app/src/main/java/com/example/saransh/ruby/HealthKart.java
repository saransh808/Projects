package com.example.saransh.ruby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class HealthKart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_kart);


       WebView w = new WebView(this);
        setContentView(w);
        w.getSettings().setJavaScriptEnabled(true);

        w.loadUrl("https://www.healthkart.com");

    }

}
