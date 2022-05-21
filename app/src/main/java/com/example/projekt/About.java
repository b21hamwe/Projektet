package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    //public WebSettings getSettings() {
    //}

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    public void loadUrl(String s) {
    }
}