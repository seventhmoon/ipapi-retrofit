### Welcome to GeoIp-android [![](https://jitpack.io/v/seventhmoon/GeoIp-android.svg)](https://jitpack.io/#seventhmoon/GeoIp-android)
This is a wrapper of [IP-API](http://ip-api.com/json) for Android platform using Volley.
In simple words, get your location information by IP address.

### Sample Application
Sample Application is included in [app](https://github.com/seventhmoon/GeoIp-android/tree/master/app)

### How to install

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}

Step 2. Add the dependency

	dependencies {
	        compile 'com.github.seventhmoon:GeoIp-android:1.0.0'
	}
	
### How to use
       ApiManager apiManager = new ApiManager(Volley.newRequestQueue(context));
       apiManager.getGeoIpInfo(new Response.Listener<GeoIpResponseModel>() {
            @Override
            public void onResponse(GeoIpResponseModel response) {
                //This is how you get the information.
                //not all attribute are listed
                String country = response.getCountry();
                String city = response.getCity();
                String countryCode = resopnse.getCountryCode();
                double latitude = response.getLatitude();
                double longtidue = response.getLongitude();
                String region = response.getRegion();
                String timezone = response.getTimezone();
                String isp = response.getIsp();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                String errorMessage = error.toString();
            }
        });

