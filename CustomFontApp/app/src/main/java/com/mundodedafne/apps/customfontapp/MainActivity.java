package com.mundodedafne.apps.customfontapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Forma para agregar la fuente desde codigo
        TextView txtCustom = (TextView) findViewById(R.id.textview_custom_fnt);
        txtCustom.setTypeface(ResourcesCompat.getFont(MainActivity.this, R.font.lobster));
    }
}