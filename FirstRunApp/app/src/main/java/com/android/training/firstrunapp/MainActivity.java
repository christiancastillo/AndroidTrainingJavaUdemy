package com.android.training.firstrunapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SharedPreferences preferences; //Variable utulizada para saber cuando el usuario corra la app por primera vez
    Context context;
    TextView textHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        preferences = context.getSharedPreferences("appPreferences",0);
        textHello = (TextView)findViewById(R.id.textview_hello);


        if (getFirstRun()){
            setRunned();
            //Add here code for anything neccessary for the first run.
            textHello.setText("First time run, HELLO.");
            //Este mensaje se muestra de nuevo si se elimina la caché de la APP
        } else{
            //This is not the first run of your mobile app.
            textHello.setText("Not first time running the APP..");
        }
    }

    Boolean getFirstRun(){
        return preferences.getBoolean("FirstRun", true);
    }

    void setRunned(){
        SharedPreferences.Editor edit = preferences.edit();
        edit.putBoolean("FirstRun" , false);
        edit.commit();
    }
}