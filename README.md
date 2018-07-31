### Welcome to IpApi-retrofit
This is a wrapper of [IP-API](http://ip-api.com/json) for Android platform using Retrofit.
In simple words, get your location information by IP address.
(for volley version, please visit https://github.com/seventhmoon/ipapi-volley)

[![](https://jitpack.io/v/seventhmoon/ipapi-retrofit.svg)](https://jitpack.io/#seventhmoon/ipapi-retrofit)

### Sample Application
Sample Application is included in [app](https://github.com/seventhmoon/IpApi-retrofit/tree/master/app)

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
	        compile 'com.github.seventhmoon:ipapi-retrofit:1.3'
	}
	     
### How to use

      IpApiService ipApiService = ServicesManager.getGeoIpService();
      ipApiService.getGeoIp().enqueue(new Callback<GeoIpResponseModel>() {
          @Override
          public void onResponse(Call<GeoIpResponseModel> call, retrofit2.Response<GeoIpResponseModel> response) {
              String country = response.body().getCountry();
              String city = response.body().getCity();
              String countryCode = resopnse.body().getCountryCode();
              double latitude = response.body().getLatitude();
              double longtidue = response.body().getLongitude();
              String region = response.body().getRegion();
              String timezone = response.body().getTimezone();
              String isp = response.body().getIsp();
          }

          @Override
          public void onFailure(Call<GeoIpResponseModel> call, Throwable t) {
              Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_SHORT).show();
          }
        });
