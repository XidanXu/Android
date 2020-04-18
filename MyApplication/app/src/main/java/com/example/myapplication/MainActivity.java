package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: we will add our logic here.
        final TextView welcomeTextView = findViewById(R.id.welcomeTextView);
        final EditText nameEditText = findViewById(R.id.nameEditText);
        final EditText emailEditText = findViewById(R.id.emailEditText);
        Button submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                welcomeTextView.setText("Welcome " + name + ", your email is: " + email);
            }
        });

    }
}

