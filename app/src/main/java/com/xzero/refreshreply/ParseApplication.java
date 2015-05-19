package com.xzero.refreshreply;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.PushService;
import com.xzero.refreshreply.activities.SignInActivity;
import com.xzero.refreshreply.models.Ad;
import com.xzero.refreshreply.models.Message;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {

		super.onCreate();

        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(Ad.class);
        ParseObject.registerSubclass(Message.class);

        Parse.initialize(this, "iySQdLjCiKkwnV9LCIRbFkXrGd90ds4V1rY9QHRv", "WxmgKcnzutrTDq1C2q5wAy5Zbw3rYUnUTcSEJwp7");
        ParseInstallation.getCurrentInstallation().saveInBackground();
        Parse.setLogLevel(Parse.LOG_LEVEL_VERBOSE);

        PushService.setDefaultPushCallback(this, SignInActivity.class);

        // only one time installation:
/*
        ParseUser user = new ParseUser();
        user.setUsername("john");
        user.setPassword("123123");
        ParseGeoPoint point = new ParseGeoPoint(
                37.400385, -122.006132
        );
        user.put("location", point);

        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                //dialog.dismiss();
                if (e != null) {
                    Log.d("Debug", "sign up");
                    // Show the error message
                    //Toast.makeText(SignUpActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                } else {
                    // Start an intent for the dispatch activity
                    //Intent intent = new Intent(SignUpActivity.this, DispatchActivity.class);
                    //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    //startActivity(intent);
                }
            }
        });
        */

//        for (int i =0 ; i < 10; i++) {
//            Ad ad = new Ad();
//            ad.setCurrentStatus("Sale");
//            ad.setPrice("$" + i + "0");
//            ad.setAddress(i + "1" + "20" + i + " Blacow Rd Fremont, CA");
//            ad.setDescription("car for sell " + i);
//            ad.setLocation(new ParseGeoPoint(37.5059315 + i, -121.9469625 - i));
//            int odd = i % 2;
//            if (odd == 1) {
//                ad.setOwnerId("fINhuLpnZw");
//                ad.setTitle("New car");
//                ad.setPhotoUrl("http://thewowstyle.com/wp-content/uploads/2015/04/car-03.jpg");
//            } else {
//                ad.setTitle("Old car");
//                ad.setOwnerId("Hh0IG6erg6");
//                ad.setPhotoUrl("http://wallpapers111.com/wp-content/uploads/2015/03/Old-Cars-Wallpaper-660x330.jpg");
//            }
//            ad.saveInBackground();
//        }


/*
        ParseUser user2 = new ParseUser();
        user2.setUsername("alice");
        user2.setPassword("123123");
        ParseGeoPoint point2 = new ParseGeoPoint(
                37.385383, -122.020552
        );
        user.put("location", point2);

        user2.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                //dialog.dismiss();
                if (e != null) {
                    Log.d("Debug", "sign up");
                    // Show the error message
                    //Toast.makeText(SignUpActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                } else {
                    // Start an intent for the dispatch activity
                    //Intent intent = new Intent(SignUpActivity.this, DispatchActivity.class);
                    //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    //startActivity(intent);
                }
            }
        });
*/
    }


}
