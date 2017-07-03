package com.androidfung.geoip;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.androidfung.geoip.model.GeoIpResponseModel;

import retrofit2.Call;
import retrofit2.Callback;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ViewDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        IpApiService ipApiService = ServicesManager.getGeoIpService();

        ipApiService.getGeoIp().enqueue(new Callback<GeoIpResponseModel>() {
            @Override
            public void onResponse(Call<GeoIpResponseModel> call, retrofit2.Response<GeoIpResponseModel> response) {
                binding.setVariable(com.androidfung.geoip.BR.response, response.body());

            }

            @Override
            public void onFailure(Call<GeoIpResponseModel> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return super.onOptionsItemSelected(item);
    }
}
