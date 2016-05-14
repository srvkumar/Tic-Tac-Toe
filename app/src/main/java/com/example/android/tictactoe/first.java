package com.example.android.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class first extends AppCompatActivity {
    Button btn1, btn2;
    RadioButton rbtn1, rbtn2;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        rbtn1 = (RadioButton) findViewById(R.id.rbtn1);
        rbtn2 = (RadioButton) findViewById(R.id.rbtn2);
        txt = (TextView) findViewById(R.id.txt1);
    }

    public void onClick(View v) {
        if (v == rbtn1) {
            rbtn1.setChecked(true);
            rbtn2.setChecked(false);
            Intent intent = new Intent(first.this, MainActivity.class);
            startActivity(intent);
        }

        if (v == rbtn2) {
            rbtn2.setChecked(true);
            rbtn1.setChecked(false);
            Intent intent = new Intent(first.this, Second.class);
            startActivity(intent);

        }


    }
}