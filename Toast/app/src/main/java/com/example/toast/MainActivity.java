package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView t1;
    Button b1 , b2 , b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.mainText);
        b1 = (Button) findViewById(R.id.colourbtn);
        b2 = (Button) findViewById(R.id.fontIncrease);
        b3 = (Button) findViewById(R.id.resetbtn);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
//        t1.setText("Hello Whatsup!");
        if(view == b1) {
            t1.setTextColor(Color.CYAN);
//            b1.setText("Reset");
        }
        else if(view == b2) {
            t1.setTextSize(45);
        }
        else if(view == b3){
            t1.setTextColor(Color.GRAY);
            t1.setTextSize(16);
            Toast T = Toast.makeText(this , "Reset Successfully" , Toast.LENGTH_SHORT);
            T.show();
        }
    }
}