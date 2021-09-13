package com.oraclesoul.calculatorapp;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view)
    {

        EditText et1 = (EditText) findViewById(R.id.num1);
        EditText et2 = (EditText) findViewById(R.id.num2);
//        Log.w("myoutput",et1.getText().toString());
        String num1Val = et1.getText().toString();
        String num2Val = et2.getText().toString();
        double num1 = parseInt(num1Val);
        double num2 = parseInt(num2Val);
        double ans = num1 + num2;
        TextView textView = (TextView) findViewById(R.id.answer);
        textView.setText(Double.toString(ans));
    }

    public void subtract(View view)
    {

        EditText et1 = (EditText) findViewById(R.id.num1);
        EditText et2 = (EditText) findViewById(R.id.num2);
//        Log.w("myoutput",et1.getText().toString());
        String num1Val = et1.getText().toString();
        String num2Val = et2.getText().toString();
        double num1 = parseInt(num1Val);
        double num2 = parseInt(num2Val);
        double ans = num1 - num2;
        TextView textView = (TextView) findViewById(R.id.answer);
        textView.setText(Double.toString(ans));

    }
    public void multiply(View view)
    {

        EditText et1 = (EditText) findViewById(R.id.num1);
        EditText et2 = (EditText) findViewById(R.id.num2);
//        Log.w("myoutput",et1.getText().toString());
        String num1Val = et1.getText().toString();
        String num2Val = et2.getText().toString();
        double num1 = parseInt(num1Val);
        double num2 = parseInt(num2Val);
        double ans = num1 * num2;
        TextView textView = (TextView) findViewById(R.id.answer);
        textView.setText(Double.toString(ans));

    }
    public void divide(View view)
    {

        EditText et1 = (EditText) findViewById(R.id.num1);
        EditText et2 = (EditText) findViewById(R.id.num2);
//        Log.w("myoutput",et1.getText().toString());
        String num1Val = et1.getText().toString();
        String num2Val = et2.getText().toString();
        double num1 = parseInt(num1Val);
        double num2 = parseInt(num2Val);
        double ans = num1 / num2;
        TextView textView = (TextView) findViewById(R.id.answer);
        textView.setText(Double.toString(ans));

    }


}