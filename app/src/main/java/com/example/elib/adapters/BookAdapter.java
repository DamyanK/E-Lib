package com.example.elib.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.elib.BookDetailInfo;
import com.example.elib.R;
import com.example.elib.holders.BookHolder;
import com.example.elib.listeners.BookCliickListener;
import com.example.elib.models.BookElements;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context c;
    List<BookElements> models;

    public BookAdapter(Context c, List<BookElements> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public BookHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_list_item, null);
        return new BookHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        if (holder instanceof BookHolder) {
            BookHolder bookHolder = (BookHolder) holder;


            bookHolder.title.setText(models.get(position).getBookTitle().getRendered());
            bookHolder.description.setText(Html.fromHtml(models.get(position).getBookContent().getRendered()));

            if(models.get(position).getEmbedded().getWpFeaturedmedia()!=null) {
                Glide.with(c)
                        .load(models.get(position).getEmbedded().getWpFeaturedmedia().get(0).getSourceUrl())
                        .into(bookHolder.image);
            }

            bookHolder.setOnBookClickListener(new BookCliickListener() {
                @Override
                public void onItemClickListener(View v, int postion) {
                    Intent intent = new Intent(c, BookDetailInfo.class);
                    intent.putExtra("title",models.get(position).getBookTitle().getRendered());
                    intent.putExtra("description",models.get(position).getBookContent().getRendered());
                    if(models.get(position).getEmbedded().getWpFeaturedmedia()!=null) {

                        intent.putExtra("imgLink", models.get(position).getEmbedded().getWpFeaturedmedia().get(0).getSourceUrl());
                    }

                    c.startActivity(intent);
                }
            });

        }
    }

    @Override
    public int getItemCount() {
        if(models==null){
            return 0;
        }
        return models.size();
    }
}
