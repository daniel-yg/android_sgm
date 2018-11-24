package com.example.rebellion.myapplication;

import android.content.Context;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.view.View;


import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<ArticlePreview> implements View.OnClickListener{
    private ArrayList<ArticlePreview> dataSet;
    Context mContext;

    public CustomAdapter(ArrayList<ArticlePreview> data, Context context) {
        super(context, R.layout.row_item, data);
        this.dataSet = data;
        this.mContext = context;
    }

    @Override
    public void onClick(View v) {
        int position = (Integer) v.getTag();
        Object object = getItem(position);
        ArticlePreview dataModel = (ArticlePreview) object;

        switch(v.getId())
        {
            case R.id.image_preview:
                Class target;
                try
                {
                    target = Class.forName(dataModel.getDestClass());
                } catch(ClassNotFoundException e) {
                    target = null;
                }
                Intent intent = new Intent(mContext, target);
                mContext.startActivity(intent);
        }
    }


}


