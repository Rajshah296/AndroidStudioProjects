package com.example.renteasy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = findViewById(R.id.Login);
        Button signup = findViewById(R.id.SignUp);
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        EditText email = findViewById(R.id.main_email);
        EditText pass = findViewById(R.id.main_pass);

        login.setOnClickListener(view -> {
                String mail = email.getText().toString().trim();
                String password = pass.getText().toString().trim();

                if(mail.equals("")){
                    email.setError("Email id is required.");
                }
                if(password.equals("")){
                    pass.setError("Password is required.");
                }
                else if(!mail.matches(emailPattern)){
                    email.setError("Valid Email Id required.");
                }
                else if(password.length() < 8){
                    pass.setError("Minimum 8 character password required.");
                }
                else{
                    new CommonMethod(MainActivity.this, "Logged In Successfully");
                    new CommonMethod(view, "Login Successfully");
                    new CommonMethod(MainActivity.this, HomeActivity.class);
                }
        });
        signup.setOnClickListener(view -> new CommonMethod(MainActivity.this, SignUpActivity.class));

    }
}