package com.example.practical9;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");

        String message = "Name: " + name + "\nEmail: " + email;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}

