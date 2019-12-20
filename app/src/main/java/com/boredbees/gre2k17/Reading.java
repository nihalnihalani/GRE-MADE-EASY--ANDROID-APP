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

public class Reading extends AppCompatActivity {

    TextView text1;

    private static final String FORMAT = "%02d:%02d:%02d";

    int seconds , minutes;

    private QuestionLibrary11 mQuestionLibrary1 = new QuestionLibrary11();
    private QuestionLibrary12 mQuestionLibrary2 = new QuestionLibrary12();
    private QuestionLibrary13 mQuestionLibrary3 = new QuestionLibrary13();
    private QuestionLibrary14 mQuestionLibrary4 = new QuestionLibrary14();
    private QuestionLibrary15 mQuestionLibrary5 = new QuestionLibrary15();

    private TextView mQuestionView,tv;
    RadioButton r1,r2,r3,r4,rb;
    RadioGroup rg;
    ImageButton btn;
    private String mAnswer,activity="",varcourse="";
    private int mScore = 0;
    private int mQuestionNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);
        tv=(TextView)findViewById(R.id.textView4);
        text1=(TextView)findViewById(R.id.tvTimer3);
        btn=(ImageButton)findViewById(R.id.imageButton7);
        mQuestionView = (TextView) findViewById(R.id.textView3);
        r1 = (RadioButton) findViewById(R.id.radioButton4);
        r2 = (RadioButton) findViewById(R.id.radioButton3);
        r3 = (RadioButton) findViewById(R.id.radioButton2);
        r4 = (RadioButton) findViewById(R.id.radioButton);
        rg = (RadioGroup) findViewById(R.id.rgroup);
        r1.setChecked(true);
        Intent i = getIntent();
        activity = i.getStringExtra("act");
        updateQuestion();

        new CountDownTimer(480000, 1000) { // adjust the milli seconds here

            public void onTick(long millisUntilFinished) {

                text1.setText(""+String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            }

            public void onFinish() {
                Intent i1=new Intent(Reading.this,TimeUpActivity.class);
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
                       // Toast.makeText(Reading.this, "correct", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    } else {
                        //Toast.makeText(Reading.this, "wrong", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                } else {
                    Intent i = new Intent(Reading.this, ResultActivity.class);
                    i.putExtra("score", mScore);
                    i.putExtra("actv",activity);
                    startActivity(i);
                }

            }
        });

    }

    private void updateQuestion() {
        if (activity.equals("1")) {
            tv.setText(mQuestionLibrary1.getComprehension(mQuestionNumber));
            mQuestionView.setText(mQuestionLibrary1.getQuestion(mQuestionNumber));
            r1.setText(mQuestionLibrary1.getChoice1(mQuestionNumber));
            r2.setText(mQuestionLibrary1.getChoice2(mQuestionNumber));
            r3.setText(mQuestionLibrary1.getChoice3(mQuestionNumber));
            r4.setText(mQuestionLibrary1.getChoice4(mQuestionNumber));
            mAnswer = mQuestionLibrary1.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
       else if (activity.equals("2")) {
            tv.setText(mQuestionLibrary2.getComprehension(mQuestionNumber));
            mQuestionView.setText(mQuestionLibrary2.getQuestion(mQuestionNumber));
            r1.setText(mQuestionLibrary2.getChoice1(mQuestionNumber));
            r2.setText(mQuestionLibrary2.getChoice2(mQuestionNumber));
            r3.setText(mQuestionLibrary2.getChoice3(mQuestionNumber));
            r4.setText(mQuestionLibrary2.getChoice4(mQuestionNumber));
            mAnswer = mQuestionLibrary2.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else if (activity.equals("3")) {
            tv.setText(mQuestionLibrary3.getComprehension(mQuestionNumber));
            mQuestionView.setText(mQuestionLibrary3.getQuestion(mQuestionNumber));
            r1.setText(mQuestionLibrary3.getChoice1(mQuestionNumber));
            r2.setText(mQuestionLibrary3.getChoice2(mQuestionNumber));
            r3.setText(mQuestionLibrary3.getChoice3(mQuestionNumber));
            r4.setText(mQuestionLibrary3.getChoice4(mQuestionNumber));
            mAnswer = mQuestionLibrary3.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else if (activity.equals("4")) {
            tv.setText(mQuestionLibrary4.getComprehension(mQuestionNumber));
            mQuestionView.setText(mQuestionLibrary4.getQuestion(mQuestionNumber));
            r1.setText(mQuestionLibrary4.getChoice1(mQuestionNumber));
            r2.setText(mQuestionLibrary4.getChoice2(mQuestionNumber));
            r3.setText(mQuestionLibrary4.getChoice3(mQuestionNumber));
            r4.setText(mQuestionLibrary4.getChoice4(mQuestionNumber));
            mAnswer = mQuestionLibrary4.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else if (activity.equals("5")) {
            tv.setText(mQuestionLibrary5.getComprehension(mQuestionNumber));
            mQuestionView.setText(mQuestionLibrary5.getQuestion(mQuestionNumber));
            r1.setText(mQuestionLibrary5.getChoice1(mQuestionNumber));
            r2.setText(mQuestionLibrary5.getChoice2(mQuestionNumber));
            r3.setText(mQuestionLibrary5.getChoice3(mQuestionNumber));
            r4.setText(mQuestionLibrary5.getChoice4(mQuestionNumber));
            mAnswer = mQuestionLibrary5.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }

    }

}
