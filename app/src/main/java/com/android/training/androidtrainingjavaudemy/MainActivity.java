package com.android.training.androidtrainingjavaudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewTimer;
    TextView textViewTimeElapsed;
    Button buttonReset;

    private final long startTime = 50 * 1000;
    private final long interval = 4 * 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTimer = (TextView)findViewById(R.id.textview_time_app); //Casting prevee errores al estar haciendo una aplicación
        textViewTimeElapsed = findViewById(R.id.textview_time_elapsed);
        buttonReset = findViewById(R.id.button_reset);

        CountDownTimer countDownTimer = new CountDownTimer(startTime, interval) {
            @Override
            public void onTick(long l) {
                textViewTimer.setText("Time: " + l / 1000);
                textViewTimeElapsed.setText("Time elapsed: " + (startTime - l) / 1000);
            }

            @Override
            public void onFinish() {
                textViewTimer.setText("TIMER FINISHED");
            }
        };
        countDownTimer.start();

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countDownTimer.cancel();
                countDownTimer.start();
            }
        });

    }

    //On start: método que se llama cuando se inicia exitosamente l

    @Override
    protected void onStart() {
        super.onStart();
    }


    //On Resume: método que se ejecuta cuando la aplicacion regresa del post state.
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}