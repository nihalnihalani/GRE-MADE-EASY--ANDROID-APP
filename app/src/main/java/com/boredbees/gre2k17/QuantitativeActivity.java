package com.boredbees.gre2k17;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class QuantitativeActivity extends AppCompatActivity {

    TextView text1;

    private static final String FORMAT = "%02d:%02d:%02d";

    int seconds , minutes;

    private QuestionLibrary1 mQuestionLibrary1 = new QuestionLibrary1();
    private QuestionLibrary2 mQuestionLibrary2 = new QuestionLibrary2();
    private QuestionLibrary3 mQuestionLibrary3 = new QuestionLibrary3();
    private QuestionLibrary4 mQuestionLibrary4 = new QuestionLibrary4();
    private QuestionLibrary5 mQuestionLibrary5 = new QuestionLibrary5();

    private TextView mQuestionView1, mQuestionView2;
    RadioButton r1, r2, r3, r4, rb;
    RadioGroup rg;
    String activity;
    ImageButton btn;
    private String mAnswer,varcourse="";
    private int mScore = 0;
    private int mQuestionNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quantitative);
        text1=(TextView)findViewById(R.id.tvTimer);
        mQuestionView1 = (TextView) findViewById(R.id.textView10);
        mQuestionView2 = (TextView) findViewById(R.id.textView12);
        r1 = (RadioButton) findViewById(R.id.radioButton13);
        r2 = (RadioButton) findViewById(R.id.radioButton12);
        r3 = (RadioButton) findViewById(R.id.radioButton11);
        r4 = (RadioButton) findViewById(R.id.radioButton10);
        rg = (RadioGroup) findViewById(R.id.rgroup);
        btn = (ImageButton) findViewById(R.id.imageButton6);
        r1.setChecked(true);
        Intent i = getIntent();
        activity = i.getStringExtra("act");
        updateQuestion();

        new CountDownTimer(450000, 1000) { // adjust the milli seconds here

            public void onTick(long millisUntilFinished) {

                text1.setText(""+String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            }

            public void onFinish() {
                Intent i1=new Intent(QuantitativeActivity.this,TimeUpActivity.class);
                i1.putExtra("score",mScore);
                i1.putExtra("actv",activity);
                startActivity(i1);
            }
        }.start();

        //Start of Button Listener for Button1
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuestionNumber < 5) {
                    //My logic for Button goes in here
                    int i = rg.getCheckedRadioButtonId();

                    rb = (RadioButton) findViewById(i);

                    varcourse = rb.getText().toString();
                    if (mAnswer.equals(varcourse)) {
                        mScore = mScore + 1;
                        //This line of code is optiona
                        updateQuestion();
                    } else {
                        updateQuestion();
                    }
                } else {
                    Intent i = new Intent(QuantitativeActivity.this, ResultActivity.class);
                    i.putExtra("score", mScore);
                    i.putExtra("actv",activity);
                    startActivity(i);
                }

            }
        });

    }

    private void updateQuestion(){
        if (activity.equals("1")) {
            mQuestionView1.setText(mQuestionLibrary1.getQuestion1(mQuestionNumber));
            mQuestionView2.setText(mQuestionLibrary1.getQuestion2(mQuestionNumber));
            mAnswer = mQuestionLibrary1.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else if (activity.equals("2")) {
            mQuestionView1.setText(mQuestionLibrary2.getQuestion1(mQuestionNumber));
            mQuestionView2.setText(mQuestionLibrary2.getQuestion2(mQuestionNumber));
            mAnswer = mQuestionLibrary2.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else if (activity.equals("3")) {
            mQuestionView1.setText(mQuestionLibrary3.getQuestion1(mQuestionNumber));
            mQuestionView2.setText(mQuestionLibrary3.getQuestion2(mQuestionNumber));
            mAnswer = mQuestionLibrary3.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else if (activity.equals("4")) {
            mQuestionView1.setText(mQuestionLibrary4.getQuestion1(mQuestionNumber));
            mQuestionView2.setText(mQuestionLibrary4.getQuestion2(mQuestionNumber));
            mAnswer = mQuestionLibrary4.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else if (activity.equals("5")) {
            mQuestionView1.setText(mQuestionLibrary5.getQuestion1(mQuestionNumber));
            mQuestionView2.setText(mQuestionLibrary5.getQuestion2(mQuestionNumber));
            mAnswer = mQuestionLibrary5.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }


    }


}