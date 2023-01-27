package com.example.persons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    RecyclerView recyclerView;
    List<PersonModel> personList;

    private ServiceGenerator serviceGenerator = ServiceGenerator.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        personList = new ArrayList<PersonModel>();

        serviceGenerator.getApi().getPersons().enqueue(new Callback<JsonResponse>() {
            @Override
            public void onResponse(Call<JsonResponse> call, Response<JsonResponse> response) {
                if (response.raw().cacheResponse() != null
                        && response.raw().networkResponse() == null) {
                    Log.d(TAG, "onResponse: response is from CACHE...");
                }

                if (response.raw().networkResponse() != null) {
                    Log.d(TAG, "onResponse: response is from NETWORK...");
                }

                JsonResponse jsonResponse = response.body();
                personList = jsonResponse.getPeople();
                PutDataIntoRecycler(personList);
            }

            @Override
            public void onFailure(Call<JsonResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: ", t);
            }
        });

    }

    private void PutDataIntoRecycler(List<PersonModel> personList) {

        Adapter adapter = new Adapter(this,personList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}