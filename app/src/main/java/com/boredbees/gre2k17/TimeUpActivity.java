package com.boredbees.gre2k17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TimeUpActivity extends AppCompatActivity {


    String act;
    int mscore;
    Button result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_up);
        result=(Button)findViewById(R.id.btnResult);
        Intent i=getIntent();
        mscore=i.getIntExtra("score",1);
        act=i.getStringExtra("actv");
        click();

    }
    public void click()
    {
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TimeUpActivity.this,ResultActivity.class);
                i.putExtra("score",mscore);
                i.putExtra("actv",act);
                startActivity(i);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(TimeUpActivity.this,"You cannot go back now",Toast.LENGTH_LONG).show();
    }
}
