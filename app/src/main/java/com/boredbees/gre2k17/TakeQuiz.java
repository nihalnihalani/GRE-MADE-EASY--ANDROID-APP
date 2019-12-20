package com.boredbees.gre2k17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TakeQuiz extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_quiz);
        btn1=(Button)findViewById(R.id.button2);
        btn2=(Button)findViewById(R.id.button10);
        btn3=(Button)findViewById(R.id.button11);
        btn4=(Button)findViewById(R.id.button12);
        btn5=(Button)findViewById(R.id.button13);
        click();


    }
    public void click()
    {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TakeQuiz.this,CourseActivity.class);
                i.putExtra("activity","1");
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TakeQuiz.this,CourseActivity.class);
                i.putExtra("activity","2");
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TakeQuiz.this,CourseActivity.class);
                i.putExtra("activity","3");
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TakeQuiz.this,CourseActivity.class);
                i.putExtra("activity","4");
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TakeQuiz.this,CourseActivity.class);
                i.putExtra("activity","5");
                startActivity(i);
            }
        });

    }
}
