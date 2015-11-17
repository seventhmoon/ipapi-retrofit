package com.androidfung.geoip;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridLayout;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.androidfung.geoip.api.ApiManager;
import com.androidfung.geoip.model.GeoIpResponseModel;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

//    private GridLayout mGridLayoutContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        mGridLayoutContainer = (GridLayout) findViewById(R.id.gridlayout_container);

        final TextView textViewInfo = (TextView) findViewById(R.id.textview_info);

        ApiManager apiManager = new ApiManager(Volley.newRequestQueue(this));
        apiManager.getGeoIpInfo(new Response.Listener<GeoIpResponseModel>() {
            @Override
            public void onResponse(GeoIpResponseModel response) {
                textViewInfo.setText(response.getCountryCode());

//                TextView textViewHeader = new TextView(getApplicationContext());
//                TextView textViewValue = new TextView(getApplicationContext());
//                textViewValue.setGravity(Gravity.END);
//
//                textViewHeader.setText();
//                textViewValue.setText();
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
