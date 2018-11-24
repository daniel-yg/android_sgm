package com.example.rebellion.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Article4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article4);
    }
    public void toHomepage(View view) {
        Intent intent = new Intent(Article4.this, Homepage.class);
        startActivity(intent);
    }
}
