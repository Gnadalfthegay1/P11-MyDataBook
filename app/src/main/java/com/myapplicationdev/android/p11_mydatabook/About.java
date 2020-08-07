package com.myapplicationdev.android.p11_mydatabook;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class About extends AppCompatActivity {
    ImageView iv;
    ActionBar ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        iv = findViewById(R.id.imageView);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg").error(R.drawable.error).into(iv);


    }
}