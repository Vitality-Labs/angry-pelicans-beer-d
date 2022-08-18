package com.example.beerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.beerd.views.SplashScreen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Log.d("MAIN_ACTIVITY", "MainActivity onCreate hit!");

        App app = new App();
        app.onCreate();

        Intent intent = new Intent(this.getApplicationContext(), SplashScreen.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        super.startActivity(intent);
        super.finish();
    }
}