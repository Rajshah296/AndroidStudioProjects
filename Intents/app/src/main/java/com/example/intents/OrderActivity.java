package com.example.intents;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        String Order = getIntent().getStringExtra("order");
        TextView textview = findViewById(R.id.order_Text);
        textview.setText(Order);
    }
}