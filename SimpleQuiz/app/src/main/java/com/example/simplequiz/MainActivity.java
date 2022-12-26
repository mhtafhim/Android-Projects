package com.example.simplequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import android.view.View;

import android.widget.Toast;





public class MainActivity extends AppCompatActivity {

    Button b1;
    CheckBox c1,c2,c3;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.submit_btn);
        c1 = findViewById(R.id.checkBox1);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);

        textview = findViewById(R.id.result_view);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(),"button 1 clicked", Toast.LENGTH_SHORT).show();
                if(c3.isChecked() && !c1.isChecked() && !c2.isChecked())
                {
                    textview.setText("Correct Answer :)");
                }
                else if(c2.isChecked() && !c1.isChecked() && !c3.isChecked())
                {
                    textview.setText("Wrong Answer");
                }
                else if(c1.isChecked() && !c3.isChecked() && !c2.isChecked())
                {
                    textview.setText("Wrong Answer");
                }
                else if(c1.isChecked() && c2.isChecked() && c3.isChecked() || c1.isChecked() && c2.isChecked() || c3.isChecked() && c2.isChecked() || c1.isChecked() && c3.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"You have to select any one option :)", Toast.LENGTH_SHORT).show();
                    textview.setText(":(");
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"You have to select atleast one option :)", Toast.LENGTH_SHORT).show();
                    textview.setText(":(");
                }

            }
        });


    }
}