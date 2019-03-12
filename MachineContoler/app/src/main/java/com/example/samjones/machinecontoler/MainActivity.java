package com.example.samjones.machinecontoler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webview = new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://machinemonitor.000webhostapp.com");
    }
}
