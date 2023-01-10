package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.bookkssss.book;
import com.example.myapplication.category.category;
import com.example.myapplication.category.categoryAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvCategory;
    private com.example.myapplication.category.categoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new categoryAdapter(this);// bien moli truong

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);
        
        
        categoryAdapter.setData(getListCategory());
    }

    private List<category> getListCategory() {
        List<category> lists = new ArrayList<>();

        List<book> lisstBook = new ArrayList<>();
        lisstBook.add(new book(R.drawable.thankss, "mu 1"));
        lisstBook.add(new book(R.drawable.mu2, "mu 2"));
        lisstBook.add(new book(R.drawable.mu3, "mu 3"));
        lisstBook.add(new book(R.drawable.mu4, "mu 4"));


        lisstBook.add(new book(R.drawable.mu1, "mu 1"));
        lisstBook.add(new book(R.drawable.mu2, "mu 2"));
        lisstBook.add(new book(R.drawable.mu3, "mu 3"));
        lisstBook.add(new book(R.drawable.mu4, "mu 4"));

        lists.add(new category("categor1",lisstBook));
        lists.add(new category("categor2",lisstBook));
        lists.add(new category("categor3",lisstBook));
        lists.add(new category("categor4",lisstBook));


        return lists;// lisst cuar category

    }
}