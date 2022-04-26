package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Opening a webpage using Intents..
        /*String url = "https://yahoo.com";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);*/

      //  Intent phoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+527712149235"));
        //startActivity(phoneIntent);

        /*Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=lG5fBDsSixM"));
        startActivity(appIntent);*/

        Intent ytIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
        startActivity(ytIntent);
    }
}