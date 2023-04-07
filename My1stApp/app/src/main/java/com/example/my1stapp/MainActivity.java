package com.example.my1stapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Send(View view){
        Toast.makeText(this,"This is sending data from app.",Toast.LENGTH_SHORT).show();
    }
    public void Recieve(View view){
        Toast.makeText(this,"This is recieving data from app.",Toast.LENGTH_SHORT).show();
    }
    public void Delete(View view){
        Toast.makeText(this,"This is deleting data from app.",Toast.LENGTH_SHORT).show();
    }
}