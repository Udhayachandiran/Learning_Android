package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.etname);
        e2=(EditText) findViewById(R.id.etpwd);
        b1=(Button) findViewById(R.id.val);

    }
    public void btnOnClick(View view){

        String s1= e1.getText().toString();
        String s2= e2.getText().toString();
        if(view==b1){
            if (s1.matches("[a-zA-z]+") && s2.matches("[0-9]+") && s2.length() == 4) {
                Toast t = Toast.makeText(this, "Validation Successful", Toast.LENGTH_SHORT);
                t.show();
                Intent intent = new Intent(this,MainActivity2.class);
                startActivity(intent);
            }
            if (!s1.matches("[a-zA-z]+")) {
                Toast t = Toast.makeText(this, "Username should contain only alphabets", Toast.LENGTH_SHORT);
                t.show();
            }
            if (!s2.matches("[0-9]+")) {
                Toast t = Toast.makeText(this, "Password should contain only numbers", Toast.LENGTH_SHORT);
                t.show();
            }
            if (s2.length() != 4) {
                Toast t = Toast.makeText(this, "Password should be 4 digits only", Toast.LENGTH_SHORT);
                t.show();
            }

        }
    }
}