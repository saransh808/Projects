package com.example.saransh.ruby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebMd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_md);



        WebView w = new WebView(this);
        setContentView(w);
        w.getSettings().setJavaScriptEnabled(true);

        w.loadUrl("m.webmd.com");

        //webview.
    }
}
