package com.example.myseventhapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView myRecyclerView;
    private RecyclerView.LayoutManager myLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRecyclerView = (RecyclerView)
                findViewById(R.id.recyclerView);
        myRecyclerView.setHasFixedSize(true);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);
                ArrayList<Schools> schoolsInfo = new ArrayList<>();
        schoolsInfo.add(new Schools(R.drawable.logo_dongguk_1,"동국대학교", "http://www.dongguk.edu/main"));
        schoolsInfo.add(new Schools(R.drawable.logo_snu, "서울대학교", "http://www.snu.ac.kr/index.html"));
        schoolsInfo.add(new Schools(R.drawable.logo_korea, "고려대학교", "http://www.korea.ac.kr/"));
        MyAdapter myAdapter = new MyAdapter(schoolsInfo);
        myRecyclerView.setAdapter(myAdapter);
    }
}
