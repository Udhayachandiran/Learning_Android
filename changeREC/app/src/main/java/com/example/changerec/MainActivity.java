package com.example.changerec;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView t1;
    LinearLayout lay;
    Button colorChanger, sizeChanger, bgChanger;
    int count = 10;
    String color = "WHITE";
    int switch_var = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.changeme);
        sizeChanger = (Button) findViewById(R.id.fontbtn);
        colorChanger = (Button) findViewById(R.id.colorbtn);
        bgChanger = (Button) findViewById(R.id.bgbtn);
        lay = (LinearLayout) findViewById(R.id.linearlayout);

        sizeChanger.setOnClickListener(this);
        colorChanger.setOnClickListener(this);
        bgChanger.setOnClickListener(this);
    }

//    public void setActivityBackgroundColor(int color) {
//        View view = this.getWindow().getDecorView();
//        view.setBackgroundColor(color);
//    }


    @Override
    public void onClick(View view) {
        if (view == sizeChanger) {
            count = count + 5;
            if (count <= 50) {
                t1.setTextSize(count);
            } else {
                count = 10;
                t1.setTextSize(count);
            }
        }

        if(view == colorChanger){
            if(t1.getCurrentTextColor() == Color.BLUE){
                t1.setTextColor(Color.BLACK);
            }
            else if (t1.getCurrentTextColor() == Color.BLACK){
                t1.setTextColor(Color.RED);
            }
            else if(t1.getCurrentTextColor() == Color.RED){
                t1.setTextColor(Color.GREEN);
            }
            else if(t1.getCurrentTextColor() == Color.GREEN){
                t1.setTextColor(Color.BLUE);
            }
        }

        if(view == bgChanger){
                switch(switch_var) {

                    case 1:
                        lay.setBackgroundColor(Color.RED);
                        switch_var = switch_var + 1;
                        break;

                    case 2:
                        lay.setBackgroundColor(Color.GREEN);
                        switch_var = switch_var + 1;
                        break;

                    case 3:
                        lay.setBackgroundColor(Color.BLUE);
                        switch_var = switch_var + 1;
                        break;

                    default:
                        switch_var = 1;
                        lay.setBackgroundColor(Color.WHITE);
                }

            }


        }


    }
