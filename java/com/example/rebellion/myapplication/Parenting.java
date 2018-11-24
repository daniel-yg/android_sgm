package com.example.rebellion.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class Parenting extends AppCompatActivity {

    ArrayList<ArticlePreview> articleList;
    ArrayList<ArticlePreview> showingArticles;
    ListView listView;
    private static CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parenting);
        listView = findViewById(R.id.search_results);
        articleList = new ArrayList<>();
        articleList.add(new ArticlePreview("3 Ide Sensory Play untuk Balita yang Mudah Dibuat. Bermain Bareng Buah Hati, Yuk!", R.drawable.article1, "Article1"));
        articleList.add(new ArticlePreview("3 Stimulasi Motorik Agar Bayimu Bisa Berjalan Sebelum Usia 1 Tahun.", R.drawable.article2, "Article2"));
        articleList.add(new ArticlePreview("5 Cara Sederhana Biar Anak Nggak Terlalu Kecanduan Youtube. Bu-ibu Yuk Pahami Dulu!", R.drawable.article3, "Article3"));
        articleList.add(new ArticlePreview("6 Fakta Seputar Flu Singapura yang Kerap Menyerang Bayi dan Balita. Para Ibu Muda Wajib Waspada", R.drawable.article4, "Article4"));
        articleList.add(new ArticlePreview("Berat Badan Anak Nggak Bertambah Sesuai Usia? Hati-Hati Bahaya Stunting", R.drawable.article5, "Article5"));
        adapter = new CustomAdapter(articleList, getApplicationContext());
        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//        });

    }
}
