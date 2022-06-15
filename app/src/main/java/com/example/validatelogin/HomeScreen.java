package com.example.validatelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        textView = findViewById(R.id.homescreentextview);
        Intent intent = getIntent();
        String mail = intent.getStringExtra(MainActivity.usrmail);
        textView.setText("Welcome : "+mail);
    }

}