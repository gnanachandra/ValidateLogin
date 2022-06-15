package com.example.validatelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    TextView textView;
    public static String usrmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void validate(View view)
    {
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        textView = findViewById(R.id.textView);
        String mail = email.getText().toString();
        String pwd = password.getText().toString();
        if(mail.equals("gnana@gmail.com")&&pwd.equals("1234"))
        {
            Intent intent = new Intent(this,HomeScreen.class);
            usrmail = mail;
            intent.putExtra(usrmail,mail);
            startActivity(intent);
        }
        else
        {
            textView.setText("Invalid Login");
        }
    }
}