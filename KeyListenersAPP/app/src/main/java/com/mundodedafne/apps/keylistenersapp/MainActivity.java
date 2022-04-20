package com.mundodedafne.apps.keylistenersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.DateKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.MultiTapKeyListener;
import android.text.method.QwertyKeyListener;
import android.text.method.TextKeyListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2, edt3, edt4, edt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupGUI();
    }

    private void setupGUI(){
        edt1 = (EditText) findViewById(R.id.edittext_one);
        edt2 = (EditText) findViewById(R.id.edittext_two);
        edt3 = (EditText) findViewById(R.id.edittext_three);
        edt4 = (EditText) findViewById(R.id.edittext_four);
        edt5 = (EditText) findViewById(R.id.edittext_five);

        DigitsKeyListener dkll = DigitsKeyListener.getInstance(true,true);
        edt1.setKeyListener(dkll);

        DigitsKeyListener dkll2 = DigitsKeyListener.getInstance(false,true);
        edt2.setKeyListener(dkll2);
        DigitsKeyListener dkll3 = DigitsKeyListener.getInstance();
        edt3.setKeyListener(dkll3);
        MultiTapKeyListener dkll4 = new MultiTapKeyListener(TextKeyListener.Capitalize.WORDS,true);
        edt4.setKeyListener(dkll4);
        QwertyKeyListener dkll5 = new QwertyKeyListener(TextKeyListener.Capitalize.SENTENCES, true);
        edt5.setKeyListener(dkll5);
    }
}