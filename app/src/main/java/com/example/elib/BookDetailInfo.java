package com.example.elib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookDetailInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail_info);
        Intent intent = getIntent();
        String description = intent.getStringExtra("description");
        String imgLink = intent.getStringExtra("imgLink");

        TextView desc = findViewById(R.id.desc_result_tv);
        desc.setText(Html.fromHtml(description));

        ImageView img = findViewById(R.id.result_iv);
        if (imgLink != null){
        Glide.with(this)
                .load(imgLink)
                .into(img);
    }
}
}