package com.example.doan_appdaynauan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Utils utils;
    DBHelper dbHelper;
    public static ArrayList<foodForGV> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        utils = new Utils(getApplicationContext());
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        dbHelper = new DBHelper(MainActivity.this);
        dbHelper.dropTable();
        dbHelper.createTable();
        dbHelper.insertFood1();
        dbHelper.insertFood2();
        dbHelper.insertFood3();
        dbHelper.insertFood4();
        dbHelper.insertFood5();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }

}