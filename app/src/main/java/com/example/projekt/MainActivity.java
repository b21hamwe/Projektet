package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {


    private ArrayList<Blommor> blommorList;
    private RecyclerView recyclerView;
    private Adapter adapter;
    private WebView View;
    private Button button;



    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=b21hamwe";
    private String TAG = "==>";






    public void showInternalWebPage(){View.loadUrl("file:///android_asset/about.HTML");}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        View = findViewById(R.id.web_View);
        adapter = new Adapter();
        blommorList = new ArrayList<Blommor>();
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        //View.getSettings().setJavaScriptEnabled(true);
        //View.setWebViewClient(new WebViewClient());
        button = findViewById(R.id.action_internal_web);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });


        new JsonTask(this).execute(JSON_URL);


    }


    @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<List<Blommor>>() {
        }.getType();

        List<Blommor> listOfblommorList = gson.fromJson(json, type);
        adapter.setblommorList(listOfblommorList);
        adapter.notifyDataSetChanged();


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

        return super.onOptionsItemSelected(item);
    }

}