package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MyRecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler_view);

        RecyclerView myrecycleview = (RecyclerView) findViewById(R.id.my_recycler_view);

        List<Object> lStudenti = generateList();
        initializeRecycleView(myrecycleview, lStudenti);
    }

    List<Object> generateList()
    {
        List<Object> list = new ArrayList<>();
        list.add("Studneti");
        list.add(new Studenti("Ivan", "Ivić"));
        list.add(new Studenti("Luka", "Lukić"));
        list.add(new Studenti("Luka", "Modrić"));
        list.add(new Studenti("Ivan", "Horvat"));

        return list;
    }
    void initializeRecycleView(RecyclerView recyclerView, List<Object> studentList){

        recyclerView.setAdapter(new MyRecycleAdapter(studentList));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)); //postavili layoutmanager
    }
}
