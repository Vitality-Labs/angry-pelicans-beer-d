package com.example.beerd.views;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.beerd.R;

public class SplashScreen extends AppCompatActivity {

    private Button browseButton;
    private Button savedListButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.splash_screen);
        browseButton = super.findViewById(R.id.btn_browse);
        savedListButton = super.findViewById(R.id.btn_saved_list);
        browseButton.setOnClickListener((View v) -> {
            Log.d("SplashScreen", "Browse Brews Clicked!");
            Intent intent = new Intent(this.getApplicationContext(), BrowseScreen.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            super.startActivity(intent);
            super.finish();
        });
        savedListButton.setOnClickListener((View v) -> {
            Log.d("SplashScreen", "Saved Brews Clicked!");
        });
    }

}
