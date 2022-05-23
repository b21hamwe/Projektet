package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class About extends AppCompatActivity {


    private WebView webView;
    private TextView unsplash;
    private MenuItem item;

    public void showInternalWebPage(){
        webView.loadUrl("file:///android_asset/about.HTML");}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);


        webView = findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        unsplash = findViewById(R.id.unsplash);

       // unsplash.setMovementMethod(LinkMovementMethod.getInstance());


    }

    //public WebSettings getSettings() {
    //}

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    public void loadUrl(String s) {
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.meny, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        if (id == R.id.action_internal_web) {
            showInternalWebPage();
            Log.d("==>", "Will display internal web page");
            return true;
        }
        else{
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}