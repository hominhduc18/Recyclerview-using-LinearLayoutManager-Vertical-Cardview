package com.example.myapplication.bookkssss;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class bookAdapterr extends RecyclerView.Adapter<bookAdapterr.bookViewHolder>{
    private List<book> mbook;
    public void setData(List<book> list){
        this.mbook =list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public bookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);

        return new bookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull bookViewHolder holder, int position) {
        book books = mbook.get(position);
        if(books == null){
            return;
        }
        holder.imgbook.setImageResource(books.getResourceID());
        holder.tv_title.setText(books.getTitle());
    }

    @Override
    public int getItemCount() {
        if(mbook != null){
            return mbook.size();
        }
        return 0;
    }

    public class bookViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgbook;
        private TextView tv_title;

        public bookViewHolder(@NonNull View itemView) {
            super(itemView);

            imgbook = itemView.findViewById(R.id.img_book);
            tv_title = itemView.findViewById(R.id.tv_title);
        }
    }
}
