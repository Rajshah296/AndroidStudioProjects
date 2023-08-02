package com.example.renteasy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button login = findViewById(R.id.Login);
        Button signup = findViewById(R.id.SignUp);

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        EditText name = findViewById(R.id.name);
        EditText email = findViewById(R.id.main_email);
        EditText phone = findViewById(R.id.phone_no);
        EditText pass = findViewById(R.id.main_pass);
        EditText confirm_pass = findViewById(R.id.confirm_pass);

        signup.setOnClickListener(view -> {
            String mail = email.getText().toString().trim();
            String password = pass.getText().toString().trim();
            String confirm_password = confirm_pass.getText().toString().trim();
            String phone_no = phone.getText().toString();
            String username = name.getText().toString();
            if(username.equals(""))
                name.setError("Name is required.");

            if(mail.equals(""))
                email.setError("Email id is required.");
            if(phone_no.equals(""))
                phone.setError("Contact no required.");
            if(password.equals(""))
                pass.setError("Password is required.");
            else if(!mail.matches(emailPattern))
                email.setError("Valid Email Id required.");
            else if(phone_no.length() < 10)
                phone.setError("Valid Contact number required.");
            else if(password.length() < 8)
                pass.setError("Minimum 8 character password required.");

            else if(!password.matches(confirm_password)){
                confirm_pass.setError("Password does not match");
            }
            else{
                new CommonMethod(this, "Account Created.");
                new CommonMethod(view, "Account Created Successfully.");
                new CommonMethod(this, HomeActivity.class);
            }
        });
        login.setOnClickListener(view -> onBackPressed());

    }
}