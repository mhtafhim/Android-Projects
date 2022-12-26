package com.example.myassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv01=(TextView) findViewById(R.id.textView1);
        String s1 = getIntent().getStringExtra("value");
        String ss = s1.toUpperCase();
        String s2 = "Name is  ";
        String s3 = s2.concat(ss);

        tv01.setText(s3);

    }
}


