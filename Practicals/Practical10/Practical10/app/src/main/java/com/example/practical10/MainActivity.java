package com.example.practical10;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mainLayout;
    private RadioGroup radioGroup;
    private RadioButton redRadioBtn, blueRadioBtn, greenRadioBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.mainlayout);
        radioGroup = findViewById(R.id.radioGroup);
        redRadioBtn = findViewById(R.id.redRadioBtn);
        blueRadioBtn = findViewById(R.id.blueRadioBtn);
        greenRadioBtn = findViewById(R.id.greenRadioBtn);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.redRadioBtn:
                        mainLayout.setBackgroundColor(Color.RED);
                        break;
                    case R.id.blueRadioBtn:
                        mainLayout.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.greenRadioBtn:
                        mainLayout.setBackgroundColor(Color.GREEN);
                        break;
                }
            }
        });

    }
}