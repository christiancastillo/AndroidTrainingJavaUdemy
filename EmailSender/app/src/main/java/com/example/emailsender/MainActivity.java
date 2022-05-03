package com.example.emailsender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewBody;
    Button btnSend;
    EditText editInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewBody = (TextView) findViewById(R.id.txt_email_send);
        btnSend = (Button) findViewById(R.id.btn_send);
        editInput = (EditText) findViewById(R.id.edt_input);

        btnSend.setOnClickListener(view -> {
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.setType("text/html");
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,("This is the email subject"));
            emailIntent.putExtra(Intent.EXTRA_TEXT, editInput.getText().toString());
            startActivity(emailIntent);
        });
    }
}