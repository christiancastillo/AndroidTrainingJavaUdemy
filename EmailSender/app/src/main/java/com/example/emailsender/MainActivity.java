package com.example.emailsender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewBody;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewBody = (TextView) findViewById(R.id.txt_email_send);
        btnSend = (Button) findViewById(R.id.btn_send);

        btnSend.setOnClickListener(view -> {
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
        });
    }
}