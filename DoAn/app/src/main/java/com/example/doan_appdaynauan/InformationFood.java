package com.example.doan_appdaynauan;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InformationFood extends AppCompatActivity {
    TextView namefood;
    TextView titlefood;
    TextView resourcefood;
    TextView processfood;
    ImageView imagefood,headImg;
    foodForGV f = new foodForGV(getContext());
    Utils utils;
    Context context;
    ActionBar actionBar;
    TextView idfood;
    String a;
    Button addFavorite;
    SharedPreferences sharedPreferences;
    DBHelper dbHelper;
    ArrayList<foodForGV> listFavToShared,lst;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_food);

        dbHelper = new DBHelper(getApplicationContext());
        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }



        Intent intent = getIntent();
        namefood = findViewById(R.id.titleFavorite);
        titlefood = findViewById(R.id.titlefood);
        resourcefood = findViewById(R.id.resourcefood);
        processfood = findViewById(R.id.processfood);
        imagefood = findViewById(R.id.imgfood);
        headImg = findViewById(R.id.head_Img);
        namefood.setText(intent.getStringExtra("name"));
        titlefood.setText(intent.getStringExtra("title"));
        resourcefood.setText(intent.getStringExtra("resource"));
        processfood.setText(intent.getStringExtra("process"));
        imagefood.setImageBitmap(f.convertStringToBitmapFromAccessCategories(getApplication(),intent.getStringExtra("image")));
        headImg.setImageBitmap(f.convertStringToBitmapFromAccessCategories(getApplication(),intent.getStringExtra("image")));


        addFavorite = findViewById(R.id.addFavorite);
        addFavorite.setOnClickListener(new View.OnClickListener() {
            int arrsize;
            @Override
            public void onClick(View view) {

                foodForGV f = new foodForGV();
                f.id = intent.getIntExtra("id",0);
                f.name = intent.getStringExtra("name");
                f.title = intent.getStringExtra("title");
                f.resources = intent.getStringExtra("resource");
                f.processing = intent.getStringExtra("process");
                f.image = intent.getStringExtra("image");
                dbHelper.insertFav(f);
                Toast.makeText(getApplicationContext(), "Đã thêm " +  intent.getStringExtra("name") + " vao danh sach yeu thich",Toast.LENGTH_SHORT).show();
            }
        });

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


}