package com.boredbees.gre2k17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    TextView tv;
    ImageButton img1,img2;
    Button btn;
    String act;
    int mscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv=(TextView)findViewById(R.id.textView6);
        img1=(ImageButton)findViewById(R.id.imageButton);
        img2=(ImageButton)findViewById(R.id.imageButton11);
        btn=(Button)findViewById(R.id.button14);
        Intent i=getIntent();
        mscore=i.getIntExtra("score",1);
        act=i.getStringExtra("actv");
        if(mscore==0)
        {
            img1.setImageResource(R.drawable.score0);
        }
        if(mscore==1)
        {
            img1.setImageResource(R.drawable.score1);
        }
        else if(mscore==2)
        {
            img1.setImageResource(R.drawable.score2);
        }
        else if(mscore==3)
        {
            img1.setImageResource(R.drawable.score3);
        }
        else if(mscore==4)
        {
            img1.setImageResource(R.drawable.score4);
        }else if(mscore==5)
        {
            img1.setImageResource(R.drawable.score5);
        }
        click();


    }
    public  void click()
    {
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ResultActivity.this,IndexActivity.class);
                startActivity(i);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ResultActivity.this,CourseActivity.class);
                i.putExtra("activity",act);
                startActivity(i);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(ResultActivity.this,"You cannot go back now",Toast.LENGTH_LONG).show();
    }

}
