package com.example.android.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;





public class MainActivity extends AppCompatActivity {


    Button one, two, three, four, five, six, seven, eight, nine,refresh,main;

    int check[]={0,0,0,0,0,0,0,0,0};
    int check2[]={0,0,0,0,0,0,0,0,0};
    int val,i,c,d,flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        main=(Button)findViewById(R.id.btn12);
    }

    public void onClick(View v) {

        if (v == refresh) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (v == main) {
            Intent intent = new Intent(MainActivity.this, first.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else {
            player(v);
            c = winp();
            computer(v);
            d = winc();
        }
    }


    public void player(View v) {


            if (d==2)
                System.exit(0);

            else if (v == one) {
                one.setText("X");
                one.setClickable(false);
                check2[0]=1;
            } else if (v == two) {
                two.setText("X");
                two.setClickable(false);
                check2[1]=1;
            } else if (v == three) {
                three.setText("X");
                three.setClickable(false);
                check2[2]=1;
            } else if (v == four) {
                four.setText("X");
                four.setClickable(false);
                check2[3]=1;
            } else if (v == five) {
                five.setText("X");
                five.setClickable(false);
                check2[4]=1;
            } else if (v == six) {
                six.setText("X");
                six.setClickable(false);
                check2[5]=1;
            } else if (v == seven) {
                seven.setText("X");
                seven.setClickable(false);
                check2[6]=1;
            } else if (v == eight) {
                eight.setText("X");
                eight.setClickable(false);
                check2[7]=1;
            } else if (v == nine) {
                nine.setText("X");
                nine.setClickable(false);
                check2[8]=1;
            }

        }


    public void computer(View v) {

        val = fcheck(v);
        if (c==1 )
            System.exit(0);

        //to Win
        else if (check2[0] == 2 && check2[1] == 2 && check2[2]!=1)
            move(3);
        else if (check2[0] == 2 && check2[2] == 2 && check2[1]!=1)
            move(2);
        else if (check2[0] == 2 && check2[3] == 2 && check2[6]!=1)
            move(7);
        else if (check2[0] == 2 && check2[4] == 2 && check2[8]!=1)
            move(9);
        else if (check2[0] == 2 && check2[6] == 2 && check2[3]!=1)
            move(4);
        else if (check2[0] == 2 && check2[8] == 2 && check2[4]!=1)
            move(5);
        else if (check2[1] == 2 && check2[2] == 2 && check2[0]!=1)
            move(1);
        else if (check2[1] == 2 && check2[4] == 2 && check2[7]!=1)
            move(8);
        else if (check2[1] == 2 && check2[7] == 2 && check2[4]!=1)
            move(5);
        else if (check2[2] == 2 && check2[4] == 2 && check2[6]!=1)
            move(7);
        else if (check2[2] == 2 && check2[6] == 2 && check2[4]!=1)
            move(5);
        else if (check2[2] == 2 && check2[5] == 2 && check2[8]!=1)
            move(9);
        else if (check2[2] == 2 && check2[8] == 2 && check2[5]!=1)
            move(6);
        else if (check2[3] == 2 && check2[6] == 2 && check2[0]!=1)
            move(1);
        else if (check2[3] == 2 && check2[4] == 2 && check2[5]!=1)
            move(6);
        else if (check2[3] == 2 && check2[5] == 2 && check2[4]!=1)
            move(5);
        else if (check2[4] == 2 && check2[5] == 2 && check2[3]!=1)
            move(4);
        else if (check2[4] == 2 && check2[6] == 2 && check2[2]!=1)
            move(3);
        else if (check2[4] == 2 && check2[7] == 2 && check2[1]!=1)
            move(2);
        else if (check2[4] == 2 && check2[8] == 2 && check2[0]!=1)
            move(1);
        else if (check2[5] == 2 && check2[8] == 2 && check2[2]!=1)
            move(3);
        else if (check2[6] == 2 && check2[7] == 2 && check2[8]!=1)
            move(9);
        else if (check2[6] == 2 && check2[8] == 2 && check2[7]!=1)
            move(8);
        else if (check2[7] == 2 && check2[8] == 2 && check2[6]!=1)
            move(7);

        //to defend from losing
        else if (check2[0] == 1 && check2[1] == 1 && check2[2]!=2)
            move(3);
        else if (check2[0] == 1 && check2[2] == 1 && check2[1]!=2)
            move(2);
        else if (check2[0] == 1 && check2[3] == 1 && check2[6]!=2)
            move(7);
        else if (check2[0] == 1 && check2[4] == 1 && check2[8]!=2)
            move(9);
        else if (check2[0] == 1 && check2[6] == 1 && check2[3]!=2)
            move(4);
        else if (check2[0] == 1 && check2[8] == 1 && check2[4]!=2)
            move(5);
        else if (check2[1] == 1 && check2[2] == 1 && check2[0]!=2)
            move(1);
        else if (check2[1] == 1 && check2[4] == 1 && check2[7]!=2)
            move(8);
        else if (check2[1] == 1 && check2[7] == 1 && check2[4]!=2)
            move(5);
        else if (check2[2] == 1 && check2[4] == 1 && check2[6]!=2)
            move(7);
        else if (check2[2] == 1 && check2[6] == 1 && check2[4]!=2)
            move(5);
        else if (check2[2] == 1 && check2[5] == 1 && check2[8]!=2)
            move(9);
        else if (check2[2] == 1 && check2[8] == 1 && check2[5]!=2)
            move(6);
        else if (check2[3] == 1 && check2[6] == 1 && check2[0]!=2)
            move(1);
        else if (check2[3] == 1 && check2[4] == 1 && check2[5]!=2)
            move(6);
        else if (check2[3] == 1 && check2[5] == 1 && check2[4]!=2)
            move(5);
        else if (check2[4] == 1 && check2[5] == 1 && check2[3]!=2)
            move(4);
        else if (check2[4] == 1 && check2[6] == 1 && check2[2]!=2)
            move(3);
        else if (check2[4] == 1 && check2[7] == 1 && check2[1]!=2)
            move(2);
        else if (check2[4] == 1 && check2[8] == 1 && check2[0]!=2)
            move(1);
        else if (check2[5] == 1 && check2[8] == 1 && check2[2]!=2)
            move(3);
        else if (check2[6] == 1 && check2[7] == 1 && check2[8]!=2)
            move(9);
        else if (check2[6] == 1 && check2[8] == 1 && check2[7]!=2)
            move(8);
        else if (check2[7] == 1 && check2[8] == 1 && check2[6]!=2)
            move(7);

        else if (check2[0]==1 && check2[8]==1 || check2[2]==1 && check2[6]==1)
        {
            i=1;
            while(i<9)
            {
                if (check2[i]==0) {
                    move(i + 1);
                    check2[i] =2;
                    flag=1;
                }
                if (flag==1)
                {
                    flag = 0;
                    break;
                }
                i+= 2;
            }
        }

        else if (val % 2 == 0 && val != 4 && check2[4]==0)
        {
            move(4 + 1);
            check2[4] = 2;
        }
        else if (val == 4) {
            i = 0;
            while (i < 9) {
                if (check2[i]==0) {
                    move(i + 1);
                    check2[i] = 2;
                    flag=1;
                }
                if (flag==1)
                {
                    flag = 0;
                    break;
                }
                i+= 2;
            }

        }
        else if (val == 1 || val == 3 || val == 5 || val == 7) {
            i = 0;
            while (i < 9) {
                if (check2[i]==0) {
                    move(i + 1);
                    check2[i] = 2;
                    flag=1;
                }
                if (flag==1)
                {
                    flag = 0;
                    break;
                }
                i+= 2;
            }
        }
        else if (val % 2 == 0)
        {
            i=0;
            while(i<9)
            {
                if (check2[i]==0) {
                    move(i + 1);
                    check2[i] = 2;
                    flag=1;
                }
                if (flag==1)
                {
                    flag = 0;
                    break;
                }
                i+= 2;
            }
        }


    }


    public int fcheck(View v) {

        if (v == one)
            check[0] = 1;
        if (v == two)
            check[1] = 1;
        if (v == three)
            check[2] = 1;
        if (v == four)
            check[3] = 1;
        if (v == five)
            check[4] = 1;
        if (v == six)
            check[5] = 1;
        if (v == seven)
            check[6] = 1;
        if (v == eight)
            check[7] = 1;
        if (v == nine)
            check[8] = 1;

        for (int j = 0; j < 9; j++)
            if (check[j] == 1)
            {
                check[j] = 0;
                return j;
            }
        return -1;
    }

    public void move(int k){
        if (k==1) {
            one.setText("O");
            one.setClickable(false);
            check2[0]=2;
        }
        if (k==2) {
            two.setText("O");
            two.setClickable(false);
            check2[1]=2;
        }
        if (k==3) {
            three.setText("O");
            three.setClickable(false);
            check2[2]=2;
        }
        if (k==4) {
            four.setText("O");
            four.setClickable(false);
            check2[3]=2;
        }
        if (k==5) {
            five.setText("O");
            five.setClickable(false);
            check2[4]=2;
        }
        if (k==6) {
            six.setText("O");
            six.setClickable(false);
            check2[5]=2;
        }
        if (k==7) {
            seven.setText("O");
            seven.setClickable(false);
            check2[6]=2;
        }
        if (k==8) {
            eight.setText("O");
            eight.setClickable(false);
            check2[7]=2;
        }
        if (k==9) {
            nine.setText("O");
            nine.setClickable(false);
            check2[8]=2;
        }
    }

    public int winc()
    {
        if (check2[0] == 2 && check2[1] == 2 && check2[2]== 2)
        {
            one.setBackgroundColor(Color.YELLOW);
            two.setBackgroundColor(Color.YELLOW);
            three.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "COMPUTER WINS", Toast.LENGTH_LONG).show();
            return 2;
        }
        else if (check2[0] == 2 && check2[3] == 2 && check2[6]== 2)
        {
            one.setBackgroundColor(Color.YELLOW);
            four.setBackgroundColor(Color.YELLOW);
            seven.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "COMPUTER WINS", Toast.LENGTH_LONG).show();
            return 2;
        }
        else if (check2[0] == 2 && check2[4] == 2 && check2[8]== 2)
        {
            one.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            nine.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "COMPUTER WINS", Toast.LENGTH_LONG).show();
            return 2;
        }
        else if (check2[1] == 2 && check2[4] == 2 && check2[7]== 2)
        {
            two.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            eight.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "COMPUTER WINS", Toast.LENGTH_LONG).show();
            return 2;
        }
        else if (check2[2] == 2 && check2[4] == 2 && check2[6]== 2)
        {
            three.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            seven.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "COMPUTER WINS", Toast.LENGTH_LONG).show();
            return 2;
        }
        else if (check2[2] == 2 && check2[5] == 2 && check2[8]== 2)
        {
            three.setBackgroundColor(Color.YELLOW);
            six.setBackgroundColor(Color.YELLOW);
            nine.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "COMPUTER WINS", Toast.LENGTH_LONG).show();
            return 2;
        }
        else if (check2[3] == 2 && check2[4] == 2 && check2[5]== 2)
        {
            four.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            six.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "COMPUTER WINS", Toast.LENGTH_LONG).show();
            return 2;
        }
        else if (check2[6] == 2 && check2[7] == 2 && check2[8]== 2)
        {
            seven.setBackgroundColor(Color.YELLOW);
            eight.setBackgroundColor(Color.YELLOW);
            nine.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "COMPUTER WINS", Toast.LENGTH_LONG).show();
            return 2;
        }

    return 0;
    }

    public int winp()
    {
        if (check2[0] == 1 && check2[1] == 1 && check2[2]== 1)
        {
            one.setBackgroundColor(Color.YELLOW);
            two.setBackgroundColor(Color.YELLOW);
            three.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "YOU WON", Toast.LENGTH_LONG).show();
            return 1;
        }
        else if (check2[0] == 1 && check2[3] == 1 && check2[6]== 1)
        {
            one.setBackgroundColor(Color.YELLOW);
            four.setBackgroundColor(Color.YELLOW);
            seven.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "YOU WON", Toast.LENGTH_LONG).show();
            return 1;
        }
        else if (check2[0] == 1 && check2[4] == 1 && check2[8]== 1)
        {
            one.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            nine.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "YOU WON", Toast.LENGTH_LONG).show();
            return 1;
        }
        else if (check2[1] == 1 && check2[4] == 1 && check2[7]== 1)
        {
            two.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            eight.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "YOU WON", Toast.LENGTH_LONG).show();
            return 1;
        }
        else if (check2[2] == 1 && check2[4] == 1 && check2[6]== 1)
        {
            three.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            seven.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "YOU WON", Toast.LENGTH_LONG).show();
            return 1;
        }
        else if (check2[2] == 1 && check2[5] == 1 && check2[8]== 1)
        {
            three.setBackgroundColor(Color.YELLOW);
            six.setBackgroundColor(Color.YELLOW);
            nine.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "YOU WON", Toast.LENGTH_LONG).show();
            return 1;
        }
        else if (check2[3] == 1 && check2[4] == 1 && check2[5]== 1)
        {
            four.setBackgroundColor(Color.YELLOW);
            five.setBackgroundColor(Color.YELLOW);
            six.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "YOU WON", Toast.LENGTH_LONG).show();
            return 1;
        }
        else if (check2[6] == 1 && check2[7] == 1 && check2[8]== 1)
        {
            seven.setBackgroundColor(Color.YELLOW);
            eight.setBackgroundColor(Color.YELLOW);
            nine.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "YOU WON", Toast.LENGTH_LONG).show();
            return 1;
        }

     return 0;
    }

}
