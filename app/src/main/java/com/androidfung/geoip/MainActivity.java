package com.androidfung.geoip;

import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.widget.Toast;

import com.androidfung.geoip.databinding.ActivityMainBinding;
import com.androidfung.geoip.model.GeoIpResponseModel;

import retrofit2.Call;
import retrofit2.Callback;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        GeoIpService ipApiService = ServicesManager.getGeoIpService();

        ipApiService.getGeoIp().enqueue(new Callback<GeoIpResponseModel>() {
            @Override
            public void onResponse(Call<GeoIpResponseModel> call, retrofit2.Response<GeoIpResponseModel> response) {
                binding.setResponse(response.body());
                Log.d(TAG, response.toString());
                Log.d(TAG, response.body().toString());
//                Log.d(TAG, response.body().toString());
                if (response.body().isError()){
                   showError(response.body().getReason());
                   Log.e(TAG, response.body().getReason());
                }
            }

            @Override
            public void onFailure(Call<GeoIpResponseModel> call, Throwable t) {
                showError(t.toString());
                Log.e(TAG, t.toString());
            }
        });
    }



    private void showError(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
}
