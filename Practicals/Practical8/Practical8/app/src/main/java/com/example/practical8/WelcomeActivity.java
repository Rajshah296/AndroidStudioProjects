package com.example.practical8;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {
    TextView tvWelcomeMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tvWelcomeMessage = findViewById(R.id.tv_welcome);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        tvWelcomeMessage.setText(String.format("Hello %s", username));
    }
}

