package com.baran.webservis;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.baran.webservis.Adadpters.AdapterBilgiler;
import com.baran.webservis.Models.Bilgiler;
import com.baran.webservis.RestApi.ManagerAll;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.ArrayList;
import java.util.List;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

   ListView listView;
    List<Bilgiler> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        istekAt();
    }

    public void tanimla() {
        listView = findViewById(R.id.listview);

    }


    public void istekAt() {

        Call<List<Bilgiler>> istekAt = ManagerAll.getInstance().getBilgiler();
        list = new ArrayList<>();
        istekAt.enqueue(new Callback<List<Bilgiler>>() {
            @Override
            public void onResponse(Call<List<Bilgiler>> call, Response<List<Bilgiler>> response) {
                if (response.isSuccessful()){
                    list = response.body();
                    AdapterBilgiler adapterBilgiler= new AdapterBilgiler(list, getApplicationContext());
                    listView.setAdapter(adapterBilgiler);
                }

            }

            @Override
            public void onFailure(Call<List<Bilgiler>> call, Throwable t) {

            }
        });
    }

}