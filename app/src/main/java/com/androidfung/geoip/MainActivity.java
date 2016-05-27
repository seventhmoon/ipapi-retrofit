package com.androidfung.geoip;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.androidfung.geoip.api.ApiManager;
import com.androidfung.geoip.databinding.ActivityMainBinding;
import com.androidfung.geoip.model.GeoIpResponseModel;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
        final TextView textViewInfo = (TextView) findViewById(R.id.textview_info);

        ApiManager apiManager = new ApiManager(Volley.newRequestQueue(this));
        apiManager.getGeoIpInfo(new Response.Listener<GeoIpResponseModel>() {
            @Override
            public void onResponse(GeoIpResponseModel response) {
                Log.d(TAG, String.valueOf(response==null));
//                textViewInfo.setText(response.toString());
                binding.setResponse(response);
//                binding.setVariable("response", response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textViewInfo.setText(error.toString());
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
