package com.boredbees.gre2k17;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class Problem extends AppCompatActivity {

    TextView text1;

    private static final String FORMAT = "%02d:%02d:%02d";

    int seconds , minutes;

    private QuestionLibrary6 mQuestionLibrary1 = new QuestionLibrary6();
    private QuestionLibrary7 mQuestionLibrary2 = new QuestionLibrary7();
    private QuestionLibrary8 mQuestionLibrary3 = new QuestionLibrary8();
    private QuestionLibrary9 mQuestionLibrary4 = new QuestionLibrary9();
    private QuestionLibrary10 mQuestionLibrary5 = new QuestionLibrary10();

    private TextView mQuestionView;
    private ImageButton btn;
    String activity = "";
    RadioButton r1,r2,r3,r4,rb;
    RadioGroup rg;
    private String mAnswer,varcourse="";
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);
        text1=(TextView)findViewById(R.id.tvTimer1);
        r1 = (RadioButton) findViewById(R.id.radioButton14);
        r2 = (RadioButton) findViewById(R.id.radioButton15);
        r3 = (RadioButton) findViewById(R.id.radioButton16);
        r4 = (RadioButton) findViewById(R.id.radioButton17);
        rg = (RadioGroup) findViewById(R.id.rgroup);
        mQuestionView = (TextView) findViewById(R.id.textView13);
        btn = (ImageButton) findViewById(R.id.imageButton8);
        r1.setChecked(true);
        Intent i = getIntent();
        activity = i.getStringExtra("act");
        updateQuestion();

        new CountDownTimer(565000, 1000) { // adjust the milli seconds here

            public void onTick(long millisUntilFinished) {

                text1.setText(""+String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            }

            public void onFinish() {
                Intent i1=new Intent(Problem.this,TimeUpActivity.class);
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
                    Intent i = new Intent(Problem.this, ResultActivity.class);
                    i.putExtra("score", mScore);
                    i.putExtra("actv",activity);
                    startActivity(i);
                }

            }
        });
    }

    private void updateQuestion() {
        if (activity.equals("1")) {
            mQuestionView.setText(mQuestionLibrary1.getQuestion(mQuestionNumber));
            r1.setText(mQuestionLibrary1.getChoice1(mQuestionNumber));
            r2.setText(mQuestionLibrary1.getChoice2(mQuestionNumber));
            r3.setText(mQuestionLibrary1.getChoice3(mQuestionNumber));
            r4.setText(mQuestionLibrary1.getChoice4(mQuestionNumber));
            mAnswer = mQuestionLibrary1.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        } else if (activity.equals("2")) {
            mQuestionView.setText(mQuestionLibrary2.getQuestion(mQuestionNumber));
            r1.setText(mQuestionLibrary2.getChoice1(mQuestionNumber));
            r2.setText(mQuestionLibrary2.getChoice2(mQuestionNumber));
            r3.setText(mQuestionLibrary2.getChoice3(mQuestionNumber));
            r4.setText(mQuestionLibrary2.getChoice4(mQuestionNumber));
            mAnswer = mQuestionLibrary2.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        } else if (activity.equals("3")) {
            mQuestionView.setText(mQuestionLibrary3.getQuestion(mQuestionNumber));
            r1.setText(mQuestionLibrary3.getChoice1(mQuestionNumber));
            r2.setText(mQuestionLibrary3.getChoice2(mQuestionNumber));
            r3.setText(mQuestionLibrary3.getChoice3(mQuestionNumber));
            r4.setText(mQuestionLibrary3.getChoice4(mQuestionNumber));
            mAnswer = mQuestionLibrary3.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        } else if (activity.equals("4")) {
            mQuestionView.setText(mQuestionLibrary4.getQuestion(mQuestionNumber));
            r1.setText(mQuestionLibrary4.getChoice1(mQuestionNumber));
            r2.setText(mQuestionLibrary4.getChoice2(mQuestionNumber));
            r3.setText(mQuestionLibrary4.getChoice3(mQuestionNumber));
            r4.setText(mQuestionLibrary4.getChoice4(mQuestionNumber));
            mAnswer = mQuestionLibrary4.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        } else if (activity.equals("5")) {
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