package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add, sub, mul, div;
    EditText num1;
    EditText num2;
    TextView result;

    float f1 , f2 , res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.multiply);
        div = (Button) findViewById(R.id.division);

        num1 = (EditText) findViewById(R.id.num1);
        num2 =  (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.result);
//        if (num1.getText() != null) {
//            f1 = Float.parseFloat(num1.getText().toString());
//
//        }


//        if(num2.getText() != null) {
//            f2 = Float.parseFloat(num2.getText().toString());
//        }

        //Float.parseFloat(e1.getText().toString());


        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        f1 = Float.parseFloat(num1.getText().toString());
        f2 = Float.parseFloat(num2.getText().toString());

        if(view == add){
            res = f1 + f2;
            result.setText(""+ res);
        }
        if(view == sub){
            res = f1 - f2;
            result.setText(""+ res);
        }
        if(view == mul){
            res = f1 * f2;
            result.setText(""+ res);
        }
        if(view == div){
            res = f1 / f2;
            result.setText(""+ res);
        }
    }
}



//Float.getParse()