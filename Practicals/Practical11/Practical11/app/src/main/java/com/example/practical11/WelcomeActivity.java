package com.example.practical11;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        @SuppressLint("MissingInflatedId") TextView textView = findViewById(R.id.textView);
        textView.setText("Welcome to the app!");
    }
}
