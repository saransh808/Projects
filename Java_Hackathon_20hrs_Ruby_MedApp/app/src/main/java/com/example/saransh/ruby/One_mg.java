package com.example.saransh.ruby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class One_mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_mg);


        WebView w = new WebView(this);
        setContentView(w);
        w.getSettings().setJavaScriptEnabled(true);

        w.loadUrl("https://www.1mg.com");


    }
}
