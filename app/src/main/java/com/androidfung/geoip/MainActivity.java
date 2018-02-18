package com.androidfung.geoip;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
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

        IpApiService ipApiService = ServicesManager.getGeoIpService();

        ipApiService.getGeoIp().enqueue(new Callback<GeoIpResponseModel>() {
            @Override
            public void onResponse(Call<GeoIpResponseModel> call, retrofit2.Response<GeoIpResponseModel> response) {
                binding.setResponse(response.body());
            }

            @Override
            public void onFailure(Call<GeoIpResponseModel> call, Throwable t) {
                showError(t);
            }
        });
    }

    private void showError(Throwable t){
        Toast.makeText(this, t.toString(), Toast.LENGTH_SHORT).show();

    }
}
