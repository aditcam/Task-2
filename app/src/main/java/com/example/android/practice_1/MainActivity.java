package com.example.android.practice_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    Button button;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       button =(Button)findViewById(R.id.button1);
        textview =(TextView)findViewById(R.id.tv1);
    }
    public void print(View view)
    {
     if(textview.getText().toString().equals("helloworld"))
     {
         textview.setText("goodbyeworld");
     }
        else if(textview.getText().toString().equals("goodbyeworld"))
     {
         textview.setText("helloworld");
     }
    }



}



