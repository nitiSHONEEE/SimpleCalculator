package com.example.sampleone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    TextView t1;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public boolean numbersInput() {

            e1 = (EditText) findViewById(R.id.num1);


            e2 = (EditText) findViewById(R.id.num2);


            t1 = (TextView) findViewById(R.id.result);

            String s1 = e1.getText().toString();


            String s2 = e2.getText().toString();


                        if ((s1.equals(null) && s2.equals(null))
                    || (s1.equals("") && s2.equals(""))) {

                String result = "Please enter a value";
                t1.setText(result);

                return false;
            } else {

                num1 = Integer.parseInt(s1);


                num2 = Integer.parseInt(s2);
            }

            return true;
        }

        public void doSum(View v) {


            if (numbersInput()) {
                int sum = num1 + num2;
                t1.setText(Integer.toString(sum));
            }
        }
        public void doPow(View v) {


            if (numbersInput()) {
                double sum = Math.pow(num1, num2);
                t1.setText(Double.toString(sum));
            }
        }

        public void doSub(View v) {


            if (numbersInput()) {
                int sum = num1 - num2;
                t1.setText(Integer.toString(sum));
            }
        }

        public void doMul(View v) {

            if (numbersInput()) {
                int sum = num1 * num2;
                t1.setText(Integer.toString(sum));
            }
        }


        public void doDiv(View v) {

            if (numbersInput()) {


                double sum = num1 / (num2 * 1.0);
                t1.setText(Double.toString(sum));
            }
        }


        public void doMod(View v) {


            if (numbersInput()) {
                double sum = num1 % num2;
                t1.setText(Double.toString(sum));
            }

}}