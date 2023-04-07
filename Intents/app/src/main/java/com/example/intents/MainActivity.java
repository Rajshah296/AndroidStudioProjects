package com.example.intents;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String order = "com.example.intents.order";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void placeOrder(View view){

        // We will handle the click on the button.//
        // Build an Intent to open another activity.
        Intent intent =  new Intent(this,OrderActivity.class);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        EditText editText2 = findViewById(R.id.editTextTextPersonName2);
        EditText editText3 = findViewById(R.id.editTextTextPersonName3);
        String message = "Order for " + editText.getText().toString()
                            + ", " + editText2.getText().toString() + " & " + editText3.getText().toString() + " has been successfully placed.";
        intent.putExtra(order,message);
        startActivity(intent);
    }
}