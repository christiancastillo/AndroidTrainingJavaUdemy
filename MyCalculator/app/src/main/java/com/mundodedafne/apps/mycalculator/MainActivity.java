package com.mundodedafne.apps.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int firstNumber, secondNumber;
    String actionType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userOperations();
    }

    private void userOperations(){
        Button num_1, num_2, num_3, num_4, num_5, num_6, num_7, num_8, num_9, num_0;
        Button btnMultiply, btnPlus, btnMinus, btnEnter, btnDivide, btnDot;
        Button btnClear;
        TextView output;

        btnClear = (Button) findViewById(R.id.btn_clear);
        num_0 = (Button) findViewById(R.id.btn_0);
        num_1 = (Button) findViewById(R.id.btn_1);
        num_2 = (Button) findViewById(R.id.btn_2);
        num_3 = (Button) findViewById(R.id.btn_3);
        num_4 = (Button) findViewById(R.id.btn_4);
        num_5 = (Button) findViewById(R.id.btn_5);
        num_6 = (Button) findViewById(R.id.btn_6);
        num_7 = (Button) findViewById(R.id.btn_7);
        num_8 = (Button) findViewById(R.id.btn_8);
        num_9 = (Button) findViewById(R.id.btn_9);
        btnDivide = (Button) findViewById(R.id.btn_divide);
        btnEnter = (Button) findViewById(R.id.btn_enter);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btnMultiply = (Button) findViewById(R.id.btn_multiply);
        btnPlus = (Button) findViewById(R.id.btn_plus);
        btnDot = (Button) findViewById(R.id.btn_dot);
        output = (TextView) findViewById(R.id.textview_output);

        num_0.setOnClickListener(view -> {
            output.setText(output.getText().toString() + "0");
        });

        num_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "1");
            }
        });

        num_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "2");
            }
        });

        num_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "3");
            }
        });
        num_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "4");
            }
        });
        num_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "5");
            }
        });
        num_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "6");
            }
        });
        num_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "7");
            }
        });
        num_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "8");
            }
        });
        num_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "9");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "/");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + ".");
            }
        });
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = output.getText().toString();
                if (number.contains("/")){
                    String[] splitNumber = number.split("/");
                    double firstNumber = Double.parseDouble(splitNumber[0]);
                    double secondNumber = Double.parseDouble(splitNumber[1]);
                    output.setText(String.valueOf(divide(firstNumber, secondNumber)));
                } else if (number.contains("+")){
                    String[] splitNumber = number.split("\\+");
                    double firstNumber = Double.parseDouble(splitNumber[0]);
                    double secondNumber = Double.parseDouble(splitNumber[1]);
                    output.setText(String.valueOf(add(firstNumber, secondNumber)));
                } else if (number.contains("-")){
                    String[] splitNumber = number.split("\\-");
                    double firstNumber = Double.parseDouble(splitNumber[0]);
                    double secondNumber = Double.parseDouble(splitNumber[1]);
                    output.setText(String.valueOf(substract(firstNumber, secondNumber)));
                }
                else if (number.contains("*")){
                    String[] splitNumber = number.split("\\*");
                    double firstNumber = Double.parseDouble(splitNumber[0]);
                    double secondNumber = Double.parseDouble(splitNumber[1]);
                    output.setText(String.valueOf(multiply(firstNumber, secondNumber)));
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "-");
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "*");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "+");
            }
        });

        btnClear.setOnClickListener(vista -> {
            output.setText("0");
        });
    }

    double add(double a, double b){
        return a+b;
    }
    double substract(double a, double b){
        return a-b;
    }
    double divide(double a, double b){
        return a/b;
    }
    double multiply(double a, double b){
        return a*b;
    }


}