package com.example.recycleviewarya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvGambelan;
    private ArrayList<Gambelan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGambelan = findViewById(R.id.rv_gambelan);
        rvGambelan.setHasFixedSize(true);

        list.addAll(DataGambelan.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvGambelan.setLayoutManager(new LinearLayoutManager(this));
        ListGambelanAdapter listGambelanAdapter = new ListGambelanAdapter(list);
        rvGambelan.setAdapter(listGambelanAdapter);
    }
}