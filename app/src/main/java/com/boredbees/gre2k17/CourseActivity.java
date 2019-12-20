package com.boredbees.gre2k17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class CourseActivity extends AppCompatActivity {


    ImageButton btn1,btn2,btn3,btn4,btn5;
    String activity1="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        btn1=(ImageButton)findViewById(R.id.imageButton5);
        btn2=(ImageButton)findViewById(R.id.imageButton4);
        btn3=(ImageButton)findViewById(R.id.imageButton3);
        btn4=(ImageButton)findViewById(R.id.imageButton2);
        btn5=(ImageButton)findViewById(R.id.imageButton);
        click();
    }
    public void click()
    {
        Intent i=getIntent();
        activity1=i.getStringExtra("activity");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CourseActivity.this,QuantitativeActivity.class);
                i.putExtra("act",activity1);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CourseActivity.this,Problem.class);
                i.putExtra("act",activity1);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CourseActivity.this,Text.class);
                i.putExtra("act",activity1);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CourseActivity.this,Reading.class);
                i.putExtra("act",activity1);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CourseActivity.this,Sentence.class);
                i.putExtra("act",activity1);
                startActivity(i);
            }
        });
    }
}
