package com.boredbees.gre2k17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class IndexActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        btn1=(Button)findViewById(R.id.button3);
        btn2=(Button)findViewById(R.id.button4);
        btn3=(Button)findViewById(R.id.button5);
        btn4=(Button)findViewById(R.id.button6);
        btn5=(Button)findViewById(R.id.button7);
        btn6=(Button)findViewById(R.id.button9);
        btn7=(Button)findViewById(R.id.button8);
        click();

    }
    public void click()
    {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(IndexActivity.this,AboutGre.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(IndexActivity.this,TipsandTricks.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(IndexActivity.this,Syllabus.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(IndexActivity.this,References.class);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(IndexActivity.this,TakeQuiz.class);
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(IndexActivity.this,AboutUs.class);
                startActivity(i);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(IndexActivity.this,QuestionPapers.class);
                startActivity(i);
            }
        });

    }
}
