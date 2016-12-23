package com.example.android.practice_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button button;
        EditText editText;
        button =(Button)findViewById(R.id.button1);
        button.setOnClickListener(this);

    }
    private void changeMessage() {

      EditText editText = (EditText) findViewById(R.id.et1);
        if(editText.getText().toString()=="Hello World!!")
        { String p="Goodbye World";
        editText.setText(p);}
        else if(editText.getText().toString()=="Goodbye World")
        {
            String r="Hello World!!";
            editText.setText(r);
        }
        }

    @Override
    public void onClick(View v) {
        changeMessage();

    }
}



