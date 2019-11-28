package com.example.junit;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;
import android.widget.EditText;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private static EditText email;
    private static EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.et_email);
        password = findViewById(R.id.et_password);
    }

    public static boolean validateEmail(CharSequence emailInput) {
//        String emailInput = email.getText().toString().trim();

        if (emailInput.toString().isEmpty()) {
            return false;
        } else if (!LoginConstants.EMAIL_PATTERN.matcher(emailInput).matches()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validatePassword(CharSequence passwordInput) {
//        String passwordInput = password.getText().toString().trim();

        if (passwordInput.toString().isEmpty()) {
            return false;
        }
        else if (!LoginConstants.PASSWORD_PATTERN.matcher(passwordInput).matches()){
            return false;
        } else {
            return true;
        }
    }

}
