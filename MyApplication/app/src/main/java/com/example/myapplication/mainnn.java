package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class mainnn extends AppCompatActivity {
    private RecyclerView rcvUser;
    private Useradapter useradapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainnnn);

        rcvUser =  findViewById(R.id.rcv_user);

        useradapter = new Useradapter(this);

        // dạng muốn hiện thị List
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvUser.setLayoutManager(linearLayoutManager);

        // set dữ liệu
        useradapter.setData(getListUser());// getlistUser tự đặt để lấy dữ liệu
        // bước cuối sau khi getList
        rcvUser.setAdapter(useradapter);
    }
    private List<User>getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.hell, "user 1"));
        list.add(new User(R.drawable.hell, "user 2"));
        return list;
    }
}
