package com.example.practical13;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText num1EditText;
    private EditText num2EditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1EditText = findViewById(R.id.num1);
        num2EditText = findViewById(R.id.num2);
        submitButton = findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("num1", num1);
                intent.putExtra("num2", num2);
                startActivity(intent);
            }
        });
    }
}
