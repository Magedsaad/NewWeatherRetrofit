package com.trying.developing.newweatherretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.trying.developing.newweatherretrofit.Model.Root;
import com.trying.developing.newweatherretrofit.rest.APIService;
import com.trying.developing.newweatherretrofit.rest.APIUrl;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String CITY_NAME = "London";
    private static final String UNITS = "metric";
    private static final String APP_ID = "94ea974f809de79cdcaad91b5bc6e00d";
    List<Root> data;
    APIService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiService = APIUrl.getService();


        Call<List<Root>>call=apiService.getWeather(CITY_NAME,UNITS,APP_ID);
      //  Toast.makeText(MainActivity.this,"tryysssy",Toast.LENGTH_LONG).show();
        call.enqueue(new Callback<List<Root>>() {
            @Override
            public void onResponse(Call<List<Root>> call, Response<List<Root>> response) {
           //     data=response.body();
                Toast.makeText(MainActivity.this,"tryyy",Toast.LENGTH_LONG).show();
                Root root=new Root();
                Log.i("temp","sss"+root.getMain().getHumidity());
                Toast.makeText(MainActivity.this,"sssrrr"+root.getMain().getTemp_max(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<List<Root>> call, Throwable t) {

            }
        });





    }
}
