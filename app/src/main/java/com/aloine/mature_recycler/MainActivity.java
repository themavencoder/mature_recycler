package com.aloine.mature_recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.aloine.mature_recycler.adapter.Adapter;
import com.aloine.mature_recycler.contract.ExpertsClickListener;
import com.aloine.mature_recycler.model.Datas;
import com.aloine.mature_recycler.model.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Model> mList;
    private Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList = Datas.MODEL;
        mRecyclerView = findViewById(R.id.recycler_view);
       // mAdapter = new Adapter(this, mList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        setAdapter();
      //  mRecyclerView.setAdapter(mAdapter);

    }

    private void setAdapter() {
        ExpertsClickListener expertsClickListener = new ExpertsClickListener() {
            @Override
            public void showDetails(Model model) {
                model.getName();
              Toast.makeText(MainActivity.this, model.getName(), Toast.LENGTH_SHORT).show();
            }


        };
        mAdapter = new Adapter(mList,expertsClickListener);
        mRecyclerView.setAdapter(mAdapter);
    }
}
