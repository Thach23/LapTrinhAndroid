package com.example.doan_appdaynauan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity implements foodForRCVAdapter.OnNoteListener3{
    ActionBar actionBar;
    public static ArrayList<foodForGV> arrayList;
    RecyclerView recyclerView;
    foodForRCVAdapter foodForRCVAdapter;
    DBHelper dbHelper;
    Utils utils;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        dbHelper = new DBHelper(getApplicationContext());
        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        arrayList = dbHelper.getALLFav();
        if(arrayList == null)
        {
            arrayList = new ArrayList<>();
        }
        Log.d("Fav Activity","On Create");
    }

    @Override
    protected void onStart() {
        super.onStart();

        recyclerView = findViewById(R.id.RecycleViewFavoriteFood);
        foodForRCVAdapter = new foodForRCVAdapter(FavoriteActivity.this, arrayList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(FavoriteActivity.this, RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(foodForRCVAdapter);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        arrayList = dbHelper.getALLFav();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public void onNoteClick3(int position) {

    }


}