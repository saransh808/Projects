package com.example.saransh.ruby;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class PatientContinue extends AppCompatActivity {


    String query; // Get the text from EditText here
    String url = "https://www.google.com/search?q="+query;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_continue);

        Intent intent = getIntent();
        String message = intent.getStringExtra(PatientLogin.EE);



        // Capture the layout's TextView and set the string as its text

        TextView textView = (TextView) findViewById(R.id.textView55);
        textView.setText(message);



        TextView textView1 = (TextView) findViewById(R.id.textView5);
        textView1.setText(" "+PatientLogin.ss);




        String url = "https://www.bing.com";

        WebView webview= (WebView) findViewById(R.id.myWebView);
        //next line explained below
        //webview.setWebViewClient(new MyWebViewClient(this));
        webview.getSettings().setJavaScriptEnabled(true);
        //webview.loadUrl(url+"/search?q="+PatientLogin.ss);

        webview.loadUrl("https://www.practo.com/search?q=%5B%7B%22word%22%3A%22"+PatientLogin.ss+"%22%2C%22autocompleted%22%3Atrue%2C%22category%22%3A%22subspeciality%22%7D%5D&city=bangalore&results_type=doctor");

       // "https://www.practo.com/search?q=%5B%7B%22word%22%3A%22"+PatientLogin.ss+"%22%2C%22autocompleted%22%3Atrue%2C%22category%22%3A%22subspeciality%22%7D%5D&city=bangalore&results_type=doctor"


    }




}
