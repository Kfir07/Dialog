package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Submitted extends AppCompatActivity {

    TextView showName;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submitted);

        showName = findViewById(R.id.showName);
        SharedPreferences sharedPref = getSharedPreferences("com.example.dialog.preferences", Context.MODE_PRIVATE);
        String username = sharedPref.getString("userName", "error");
        showName.setText("YOUR NAME IS: "+username);

    }
}