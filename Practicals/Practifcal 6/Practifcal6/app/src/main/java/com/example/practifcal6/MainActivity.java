package com.example.practifcal6;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity
{
    TextView textView1;
    String text;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=(TextView)findViewById(R.id.textView1);
        text = textView1.getText().toString();
        text = text + "\n Inside onCreate Method.";
        textView1.setText(text);
    }

    public void onStart()
    {
        super.onStart();
        text = textView1.getText().toString();
        text = text + "\n Inside onStart Method.";
        textView1.setText(text);
    }

    public void onResume()
    {
        super.onResume();
        text = textView1.getText().toString();
        text = text + "\n Inside onResume Method.";
        textView1.setText(text);
    }

    public void onPause()
    {
        super.onPause();
        text = textView1.getText().toString();
        text = text + "\n Inside onPause Method.";
        textView1.setText(text);
    }
    public void onRestart()
    {
    super.onRestart();
        text = textView1.getText().toString();
        text = text + "\n Inside onRestart Method.";
        textView1.setText(text);
    }

    public void onDestroy()
    {
        super.onDestroy();
        text = textView1.getText().toString();
        text = text + "\n Inside onDestroy Method.";
        textView1.setText(text);
    }

}