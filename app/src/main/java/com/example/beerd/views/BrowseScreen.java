package com.example.beerd.views;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.beerd.R;
import androidx.appcompat.app.AppCompatActivity;

public class BrowseScreen extends AppCompatActivity {

    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.browse_screen);
        backButton = super.findViewById(R.id.btn_back);
        backButton.setOnClickListener((View v) -> {
            Intent intent = new Intent(this.getApplicationContext(), SplashScreen.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            super.startActivity(intent);
            super.finish();
        });
    }

}
