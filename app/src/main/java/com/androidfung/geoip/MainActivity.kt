package com.androidfung.geoip

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import com.androidfung.geoip.ServicesManager.geoIpService
import com.androidfung.geoip.databinding.ActivityMainBinding
import com.androidfung.geoip.model.GeoIpResponseModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val ipApiService = geoIpService
        ipApiService.getGeoIp().enqueue(object : Callback<GeoIpResponseModel> {
            override fun onResponse(call: Call<GeoIpResponseModel>, response: Response<GeoIpResponseModel>) {
                binding.response = response.body()
                Log.d(TAG, response.toString())
                Log.d(TAG, response.body().toString())
                if (response.body()!!.isError) {
                    showError(response.body()!!.reason)
                    Log.e(TAG, response.body()!!.reason.toString())
                }
            }

            override fun onFailure(call: Call<GeoIpResponseModel>, t: Throwable) {
                showError(t.toString())
                Log.e(TAG, t.toString())
            }
        })
    }

    private fun showError(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}