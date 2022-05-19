package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {


    private ArrayList<Blommor> blommorList;
    private RecyclerView recyclerView;
    private Adapter adapter;

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=b21hamwe";
    private String TAG = "==>";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new Adapter();
        blommorList = new ArrayList<Blommor>();
        recyclerView = findViewById(R.id. recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        new JsonTask(this).execute(JSON_URL);
    }


    @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<List<Blommor>>() {
        }.getType();

        List<Blommor> listOfblommorList = gson.fromJson(json,type);
        adapter.setblommorList(listOfblommorList);
        adapter.notifyDataSetChanged();



    }
}