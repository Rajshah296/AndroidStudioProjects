package com.example.renteasy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Login = findViewById(R.id.Login);
        Login.setOnClickListener(view -> {
            System.out.println("Logged In Successfully");
            Toast.makeText(MainActivity.this,"Logged In Successfully",Toast.LENGTH_SHORT).show();
            Snackbar.make(view,"Successfully Logged In", Snackbar.LENGTH_SHORT).show();
        });

    }
}