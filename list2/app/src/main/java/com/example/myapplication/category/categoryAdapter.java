package com.example.myapplication.category;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.bookkssss.bookAdapterr;

import java.util.List;

public class categoryAdapter extends RecyclerView.Adapter<categoryAdapter.CategoryViewHolder>{
    private Context mcontext;
    private List<category> mlistCategory;

    public categoryAdapter(Context context) {
        this.mcontext = context;
    }
    public void setData(List<category>list){
        this.mlistCategory = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.iteam_categorry,parent,false);
        return new CategoryViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        category categorys = mlistCategory.get(position);
        if(categorys == null){
            return;
        }
        holder.tv_namecategory.setText(categorys.getNameCategory());
        // cuoonj theo chieeuf ngang
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mcontext,RecyclerView.HORIZONTAL,false);
        holder.rcv_book.setLayoutManager(linearLayoutManager);

        bookAdapterr bookadapters = new bookAdapterr();
        bookadapters.setData(categorys.getBook());

        holder.rcv_book.setAdapter((bookadapters));// set vao adapter
    }

    @Override
    public int getItemCount() {
        if(mlistCategory != null){
            return mlistCategory.size();
        }
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_namecategory;
        private RecyclerView rcv_book;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_namecategory = itemView.findViewById(R.id.tv_namecategory);
            rcv_book = itemView.findViewById(R.id.rcv_book);

        }
    }
}
