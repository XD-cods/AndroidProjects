package com.example.myapplication1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView aboutText = findViewById(R.id.about_text);
        aboutText.setText(R.string.about_app_text);
    }
}