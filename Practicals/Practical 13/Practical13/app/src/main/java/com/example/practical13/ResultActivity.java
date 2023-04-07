package com.example.practical13;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    private TextView sumTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        sumTextView = findViewById(R.id.sum_text);

        int num1 = getIntent().getIntExtra("num1", 0);
        int num2 = getIntent().getIntExtra("num2", 0);
        int sum = num1 + num2;

        sumTextView.setText(String.format("Sum: %d", sum));
    }
}
