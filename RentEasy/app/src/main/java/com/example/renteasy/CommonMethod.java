package com.example.renteasy;



import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

import com.google.android.material.snackbar.Snackbar;

public class CommonMethod {

    CommonMethod(Context context, String Message){
        Toast.makeText(context, Message, Toast.LENGTH_SHORT).show();
    }


    CommonMethod(View view, String Message){
        Snackbar.make(view, Message, Snackbar.LENGTH_SHORT).show();
    }

    CommonMethod(Context context,Class<?> nextClass){
        Intent intent = new Intent(context, nextClass);
        context.startActivity(intent);
    }
}
