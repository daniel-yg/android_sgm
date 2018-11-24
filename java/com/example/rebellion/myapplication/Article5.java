package com.example.rebellion.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Article5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article5);
    }
    public void toHomepage(View view) {
        Intent intent = new Intent(Article5.this, Homepage.class);
        startActivity(intent);
    }
}
