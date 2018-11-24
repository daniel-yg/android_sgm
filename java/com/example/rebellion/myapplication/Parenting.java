package com.example.rebellion.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class Parenting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parenting);

    }

    public void toArticle1(View view) {
        Intent intent = new Intent(Parenting.this, Article1.class);
        startActivity(intent);
    }
    public void toArticle2(View view) {
        Intent intent = new Intent(Parenting.this, Article2.class);
        startActivity(intent);
    }

    public void toArticle3(View view) {
        Intent intent = new Intent(Parenting.this, Article3.class);
        startActivity(intent);
    }
    public void toArticle4(View view) {
        Intent intent = new Intent(Parenting.this, Article4.class);
        startActivity(intent);
    }
    public void toArticle5(View view) {
        Intent intent = new Intent(Parenting.this, Article5.class);
        startActivity(intent);
    }
}
