package com.example.elib.holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.elib.R;
import com.example.elib.listeners.BookCliickListener;

public class BookHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView title, description;
    public ImageView image;
    public BookCliickListener bookCliickListener;

    public BookHolder(@NonNull View itemView) {
        super(itemView);
        this.title = itemView.findViewById(R.id.book_title_tv);
        this.description = itemView.findViewById(R.id.book_description_tv);
        this.image = itemView.findViewById(R.id.book_img);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.bookCliickListener.onItemClickListener(view,getLayoutPosition());

    }
    public void setOnBookClickListener(BookCliickListener b){
        this.bookCliickListener = b;
    }
}
