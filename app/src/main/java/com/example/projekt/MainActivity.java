package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {


    private ArrayList<Blommor> blommorList;
    private RecyclerView recyclerView;
    private BlomAdapter adapter;

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=b21hamwe";
    private String TAG = "==>";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new BlomAdapter();
        blommorList = new ArrayList<blommor>();
        recyclerView = findViewById(R.id. recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onPostExecute(String json) {
    }
}