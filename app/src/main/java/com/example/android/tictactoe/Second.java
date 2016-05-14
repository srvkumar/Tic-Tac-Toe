package com.example.android.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Second extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine,refresh,menu;
    static int i=1;
    int c,d;
    int check2[]={0,0,0,0,0,0,0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        refresh=(Button)findViewById(R.id.btn11);
        menu=(Button)findViewById(R.id.btn12);
    }
    public void onClick(View v) {
        if (v == refresh) {
            Intent intent = new Intent(Second.this,Second.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (v == menu) {
            Intent intent = new Intent(Second.this, first.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
        else if (i % 2 == 1) {
            player1(v);
            c=winp1();
        } else if (i % 2 == 0) {
            player2(v);
            d=winp2();
           }
        i++;
    }
    public void player1(View v){
        if(d==2)
            System.exit(0);

            else if (v == one)
            {
                one.setText("X");
                one.setClickable(false);
                check2[0]=1;
            }
            else if (v == two)
            {
                two.setText("X");
                two.setClickable(false);
                check2[1]=1;
            }
            else if (v == three)
            {
                three.setText("X");
                three.setClickable(false);
                check2[2]=1;
            }
            else if (v == four)
            {
                four.setText("X");
                four.setClickable(false);
                check2[3]=1;
            }

            else if (v == five)
            {
                five.setText("X");
                five.setClickable(false);
                check2[4]=1;
            }

            else if (v == six)
            {
                six.setText("X");
                six.setClickable(false);
                check2[5]=1;
            }
            else if (v == seven)
            {
                seven.setText("X");
                seven.setClickable(false);
                check2[6]=1;
            }
            else if (v == eight)
            {
                eight.setText("X");
                eight.setClickable(false);
                check2[7]=1;
            }
            else if (v == nine)
            {
                nine.setText("X");
                nine.setClickable(false);
                check2[8]=1;
            }
        }

    public void player2(View v)
    {
        if(c==1)
            System.exit(0);

        else if (v == one) {
                one.setText("O");
                one.setClickable(false);
                check2[0]=2;
            }
        else if (v == two) {
                two.setText("O");
                two.setClickable(false);
                check2[1]=2;
        }
        else if (v == three) {
                three.setText("O");
                three.setClickable(false);
                check2[2]=2;
            }
        else if (v == four) {
                four.setText("O");
                four.setClickable(false);
                check2[3]=2;
            }
        else if (v == five) {
                five.setText("O");
                five.setClickable(false);
                check2[4]=2;
            }
        else if (v == six) {
                six.setText("O");
                six.setClickable(false);
                check2[5]=2;
            }
        else if (v == seven) {
                seven.setText("O");
                seven.setClickable(false);
                check2[6]=2;
            }
        else if (v == eight) {
                eight.setText("O");
                eight.setClickable(false);
                check2[7]=2;
            }
        else if (v == nine) {
                nine.setText("O");
                nine.setClickable(false);
                check2[8]=2;
            }

        }

    public int winp2()
    {
        if (check2[0] == 2 && check2[1] == 2 && check2[2]== 2)
        {
            one.setBackgroundColor(Color.YELLOW);
            two.setBackgroundColor(Color.YELLOW);
            three.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 2 WINS", Toast.LENGTH_SHORT).show();
            return 2;
        }
        else if (check2[0] == 2 && check2[3] == 2 && check2[6]== 2)
        {
            one.setBackgroundColor(Color.YELLOW);
            four.setBackgroundColor(Color.YELLOW);
            seven.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 2 WINS", Toast.LENGTH_SHORT).show();
            return 2;
        }
        else if (check2[0] == 2 && check2[4] == 2 && check2[8]== 2)
        {
            one.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            nine.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 2 WINS", Toast.LENGTH_SHORT).show();
            return 2;
        }
        else if (check2[1] == 2 && check2[4] == 2 && check2[7]== 2)
        {
            two.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            eight.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 2 WINS", Toast.LENGTH_SHORT).show();
            return 2;
        }
        else if (check2[2] == 2 && check2[4] == 2 && check2[6]== 2)
        {
            three.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            seven.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 2 WINS", Toast.LENGTH_SHORT).show();
            return 2;
        }
        else if (check2[2] == 2 && check2[5] == 2 && check2[8]== 2)
        {
            three.setBackgroundColor(Color.YELLOW);
            six.setBackgroundColor(Color.YELLOW);
            nine.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 2 WINS", Toast.LENGTH_SHORT).show();
            return 2;
        }
        else if (check2[3] == 2 && check2[4] == 2 && check2[5]== 2)
        {
            four.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            six.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 2 WINS", Toast.LENGTH_SHORT).show();
            return 2;
        }
        else if (check2[6] == 2 && check2[7] == 2 && check2[8]== 2)
        {
            seven.setBackgroundColor(Color.YELLOW);
            eight.setBackgroundColor(Color.YELLOW);
            nine.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 2 WINS", Toast.LENGTH_SHORT).show();
            return 2;
        }

        return 0;
    }

    public int winp1()
    {
        if (check2[0] == 1 && check2[1] == 1 && check2[2]== 1)
        {
            one.setBackgroundColor(Color.YELLOW);
            two.setBackgroundColor(Color.YELLOW);
            three.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 1 WINS", Toast.LENGTH_SHORT).show();
            return 1;
        }
        else if (check2[0] == 1 && check2[3] == 1 && check2[6]== 1)
        {
            one.setBackgroundColor(Color.YELLOW);
            four.setBackgroundColor(Color.YELLOW);
            seven.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 1 WINS", Toast.LENGTH_SHORT).show();
            return 1;
        }
        else if (check2[0] == 1 && check2[4] == 1 && check2[8]== 1)
        {
            one.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            nine.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 1 WINS", Toast.LENGTH_SHORT).show();
            return 1;
        }
        else if (check2[1] == 1 && check2[4] == 1 && check2[7]== 1)
        {
            two.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            eight.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 1 WINS", Toast.LENGTH_SHORT).show();
            return 1;
        }
        else if (check2[2] == 1 && check2[4] == 1 && check2[6]== 1)
        {
            three.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            seven.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 1 WINS", Toast.LENGTH_SHORT).show();
            return 1;
        }
        else if (check2[2] == 1 && check2[5] == 1 && check2[8]== 1)
        {
            three.setBackgroundColor(Color.YELLOW);
            six.setBackgroundColor(Color.YELLOW);
            nine.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 1 WINS", Toast.LENGTH_SHORT).show();
            return 1;
        }
        else if (check2[3] == 1 && check2[4] == 1 && check2[5]== 1)
        {
            four.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            six.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 1 WINS", Toast.LENGTH_SHORT).show();
            return 1;
        }
        else if (check2[6] == 1 && check2[7] == 1 && check2[8]== 1)
        {
            seven.setBackgroundColor(Color.YELLOW);
            eight.setBackgroundColor(Color.YELLOW);
            nine.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "PLAYER 1 WINS", Toast.LENGTH_SHORT).show();
            return 1;
        }

        return 0;
    }


}

