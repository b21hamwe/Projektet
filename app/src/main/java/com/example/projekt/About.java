package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class About extends AppCompatActivity {


    private WebView webView;
    private Button button;

    public void showInternalWebPage(){
        webView.loadUrl("file:///android_asset/about.HTML");}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        webView = findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        button = findViewById(R.id.action_internal_web);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, About.class);
                startActivity(intent);
            }
        });
    }

    //public WebSettings getSettings() {
    //}

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    public void loadUrl(String s) {
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

        return super.onOptionsItemSelected(item);
    }
}