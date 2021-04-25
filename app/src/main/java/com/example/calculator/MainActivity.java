package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView top;
    private TextView bottom;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top=findViewById(R.id.result);
        bottom=findViewById(R.id.result1);

        top.setText("");
        bottom.setText("0");

        configureButton();

    }

    private void configureButton(){


        Button zero = (findViewById(R.id.btn0));
        Button one = (findViewById(R.id.btn1));
        Button two = (findViewById(R.id.btn2));
        Button three = (findViewById(R.id.btn3));
        Button four = (findViewById(R.id.btn4));
        Button five = (findViewById(R.id.btn5));
        Button six = (findViewById(R.id.btn6));
        Button seven = (findViewById(R.id.btn7));
        Button eight = (findViewById(R.id.btn8));
        Button nine = (findViewById(R.id.btn9));

        Button minus = (findViewById(R.id.minus));
        Button del = (findViewById(R.id.del));
        Button plus = (findViewById(R.id.plus));
        Button equals = (findViewById(R.id.equals));

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottom.setText("0");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottom.setText(bottom.getText()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottom.setText(bottom.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottom.setText(bottom.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottom.setText(bottom.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottom.setText(bottom.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottom.setText(bottom.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottom.setText(bottom.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottom.setText(bottom.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottom.setText(bottom.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottom.setText(bottom.getText()+"9");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                top.setText(bottom.getText());
            }
        });




    }

    private void performAction(Button btn,int num) {
        switch(num){
            case 10: {


            }
            case 11: {

            }
            case 12: {

            }
            case 13: {}
            case 14: {}
            case 15: {}
            case 16: {}
            default: break;
        }
    }

}
