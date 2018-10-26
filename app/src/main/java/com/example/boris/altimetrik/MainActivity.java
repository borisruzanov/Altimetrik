package com.example.boris.altimetrik;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.boris.altimetrik.Models.Example;
import com.example.boris.altimetrik.Models.Proposal;
import com.example.boris.altimetrik.network.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button button;
    List<Proposal> trailerList;
    RecyclerView recyclerView;
    MainListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();

        trailerList = new ArrayList<>();
        listAdapter = new MainListAdapter(trailerList, setOnItemClickCallback());

        recyclerView = findViewById(R.id.recycler_list_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);



    }

    private void getData() {

        RetrofitClient.
                getApiService()
                .loadData(getApplicationContext().getString(R.string.api))
                .enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        Example trailerModel = response.body();
                        if (trailerModel != null) {
                            trailerList.addAll(trailerModel.getProposals());
                            listAdapter = new MainListAdapter(trailerList, setOnItemClickCallback());
                            recyclerView.setAdapter(listAdapter);
                            listAdapter.notifyDataSetChanged();
                        }
                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {
                        Log.d("tag", "inside failure" + t + " " + call);
                    }
                });
    }

    private OnItemClickListener.OnItemClickCallback setOnItemClickCallback() {
        OnItemClickListener.OnItemClickCallback onItemClickCallback = new OnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Log.d("tag","onclicked");
                Intent intent = new Intent(MainActivity.this, DetailedActivity.class);
                Proposal item = trailerList.get(position);
                intent.putExtra("title", item.getTitle());
                intent.putExtra("donors", item.getNumDonors());
                intent.putExtra("description", item.getShortDescription());
                intent.putExtra("poster_path", item.getImageURL());
                startActivity(intent);


            }
        };
        return onItemClickCallback;
    }
}
