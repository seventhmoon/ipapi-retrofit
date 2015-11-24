### Welcome to GeoIp-android
This is a wrapper of [IP-API](http://ip-api.com/json) for Android platform using Volley.
In simple words, get your location information by IP address.

### Sample Application
Sample Application is included in [app](https://github.com/seventhmoon/GeoIp-android/tree/master/app)

### How to use
       ApiManager apiManager = new ApiManager(Volley.newRequestQueue(context));
        apiManager.getGeoIpInfo(new Response.Listener<GeoIpResponseModel>() {
            @Override 
            public void onResponse(GeoIpResponseModel response) {
                //This is how you get the Country Code
                textViewInfo.setText(response.getCountryCode());
            } 
        }, new Response.ErrorListener() {
            @Override 
            public void onErrorResponse(VolleyError error) {
                textViewInfo.setText(error.toString());
            } 
        }); 
