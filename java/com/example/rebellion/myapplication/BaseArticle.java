package com.example.rebellion.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BaseArticle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_article);
    }

    public void toHomepage(View view) {
        Intent intent = new Intent(BaseArticle.this, Homepage.class);
        startActivity(intent);
    }
}
