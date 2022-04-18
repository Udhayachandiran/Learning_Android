package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void gotoact1(View v){
        Button b1 = (Button) findViewById(R.id.but1);
        if(v==b1){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}