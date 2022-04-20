package com.mundodedafne.apps.whatstoday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView txtDateTime = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDateTime = (TextView) findViewById(R.id.textview_datetime);

        //String dateTimeFormat = "dd/MM/yyyy hh:mm:ss a"; //am or pm
        //String dateTimeFormat = "MMMM dd, yyyy h:mm aa"; //am or pm //abril, dia, año hora y fecha
        //String dateTimeFormat = "E, MMMM dd, yyyy h:mm aa"; //am or pm //abril, dia, año hora y fecha
        String dateTimeFormat = "EEEE, MMMM dd, yyyy h:mm aa"; //am or pm //abril, dia, año hora y fecha
        Date dateFormat = Calendar.getInstance().getTime();

        txtDateTime.setText(DateFormat.format(dateTimeFormat, dateFormat).toString().toUpperCase());
    }
}