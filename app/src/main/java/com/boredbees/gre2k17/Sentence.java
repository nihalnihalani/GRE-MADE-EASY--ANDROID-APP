package com.boredbees.gre2k17;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class Sentence extends AppCompatActivity {
    TextView text1;

    private static final String FORMAT = "%02d:%02d:%02d";

    int seconds , minutes;
    private QuestionLibrary21 mQuestionLibrary1 = new QuestionLibrary21();
    private QuestionLibrary22 mQuestionLibrary2 = new QuestionLibrary22();
    private QuestionLibrary23 mQuestionLibrary3 = new QuestionLibrary23();
    private QuestionLibrary24 mQuestionLibrary4 = new QuestionLibrary24();
    private QuestionLibrary25 mQuestionLibrary5 = new QuestionLibrary25();

    private TextView mQuestionView;
    ImageButton btn;
    CheckBox c1,c2,c3,c4,c5,c6;
    private String mAnswer,varcourse="";
    String activity="";
    private int mScore = 0,count=0;
    private int mQuestionNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentence);
        text1=(TextView)findViewById(R.id.tvTimer4);
        mQuestionView=(TextView)findViewById(R.id.textView3);
        c1=(CheckBox)findViewById(R.id.checkBox6);
        c2=(CheckBox)findViewById(R.id.checkBox5);
        c3=(CheckBox)findViewById(R.id.checkBox4);
        c4=(CheckBox)findViewById(R.id.checkBox3);
        c5=(CheckBox)findViewById(R.id.checkBox2);
        c6=(CheckBox)findViewById(R.id.checkBox);
        btn=(ImageButton)findViewById(R.id.imageButton9);
        Intent i = getIntent();
        activity = i.getStringExtra("act");
        updateQuestion();

        new CountDownTimer(300000, 1000) { // adjust the milli seconds here

            public void onTick(long millisUntilFinished) {

                text1.setText(""+String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            }

            public void onFinish() {
                Intent i1=new Intent(Sentence.this,TimeUpActivity.class);
                i1.putExtra("score",mScore);
                i1.putExtra("actv",activity);
                startActivity(i1);
            }
        }.start();

        //Start of Button Listener for Button1
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here
                if (mQuestionNumber < 5) {
                    varcourse = "";
                    count = 0;

                    if (c1.isChecked()) {
                        varcourse += c1.getText().toString();
                        count++;
                    }
                    if (c2.isChecked()) {
                        varcourse += c2.getText().toString();
                        count++;
                    }
                    if (c3.isChecked()) {
                        varcourse += c3.getText().toString();
                        count++;
                    }
                    if (c4.isChecked()) {
                        varcourse += c4.getText().toString();
                        count++;
                    }
                    if (c5.isChecked()) {
                        varcourse += c5.getText().toString();
                        count++;
                    }
                    if (c6.isChecked()) {
                        varcourse += c6.getText().toString();
                        count++;
                    }
                    if (count == 2) {
                        if (mAnswer.equals(varcourse)) {
                            mScore = mScore + 1;
                          //  Toast.makeText(Sentence.this, "correct", Toast.LENGTH_SHORT).show();
                            updateQuestion();
                        } else {
                           // Toast.makeText(Sentence.this, "wrong", Toast.LENGTH_SHORT).show();
                            updateQuestion();
                        }
                    } else {
                        Toast.makeText(Sentence.this, "Please select only two options", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Intent i = new Intent(Sentence.this, ResultActivity.class);
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
            c1.setText(mQuestionLibrary1.getChoice1(mQuestionNumber));
            c2.setText(mQuestionLibrary1.getChoice2(mQuestionNumber));
            c3.setText(mQuestionLibrary1.getChoice3(mQuestionNumber));
            c4.setText(mQuestionLibrary1.getChoice4(mQuestionNumber));
            c5.setText(mQuestionLibrary1.getChoice5(mQuestionNumber));
            c6.setText(mQuestionLibrary1.getChoice6(mQuestionNumber));
            mAnswer = mQuestionLibrary1.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        if (activity.equals("2")) {
            mQuestionView.setText(mQuestionLibrary2.getQuestion(mQuestionNumber));
            c1.setText(mQuestionLibrary2.getChoice1(mQuestionNumber));
            c2.setText(mQuestionLibrary2.getChoice2(mQuestionNumber));
            c3.setText(mQuestionLibrary2.getChoice3(mQuestionNumber));
            c4.setText(mQuestionLibrary2.getChoice4(mQuestionNumber));
            c5.setText(mQuestionLibrary2.getChoice5(mQuestionNumber));
            c6.setText(mQuestionLibrary2.getChoice6(mQuestionNumber));
            mAnswer = mQuestionLibrary2.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        if (activity.equals("3")) {
            mQuestionView.setText(mQuestionLibrary3.getQuestion(mQuestionNumber));
            c1.setText(mQuestionLibrary3.getChoice1(mQuestionNumber));
            c2.setText(mQuestionLibrary3.getChoice2(mQuestionNumber));
            c3.setText(mQuestionLibrary3.getChoice3(mQuestionNumber));
            c4.setText(mQuestionLibrary3.getChoice4(mQuestionNumber));
            c5.setText(mQuestionLibrary3.getChoice5(mQuestionNumber));
            c6.setText(mQuestionLibrary3.getChoice6(mQuestionNumber));
            mAnswer = mQuestionLibrary3.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        if (activity.equals("4")) {
            mQuestionView.setText(mQuestionLibrary4.getQuestion(mQuestionNumber));
            c1.setText(mQuestionLibrary4.getChoice1(mQuestionNumber));
            c2.setText(mQuestionLibrary4.getChoice2(mQuestionNumber));
            c3.setText(mQuestionLibrary4.getChoice3(mQuestionNumber));
            c4.setText(mQuestionLibrary4.getChoice4(mQuestionNumber));
            c5.setText(mQuestionLibrary4.getChoice5(mQuestionNumber));
            c6.setText(mQuestionLibrary4.getChoice6(mQuestionNumber));
            mAnswer = mQuestionLibrary4.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        if (activity.equals("5")) {
            mQuestionView.setText(mQuestionLibrary5.getQuestion(mQuestionNumber));
            c1.setText(mQuestionLibrary5.getChoice1(mQuestionNumber));
            c2.setText(mQuestionLibrary5.getChoice2(mQuestionNumber));
            c3.setText(mQuestionLibrary5.getChoice3(mQuestionNumber));
            c4.setText(mQuestionLibrary5.getChoice4(mQuestionNumber));
            c5.setText(mQuestionLibrary5.getChoice5(mQuestionNumber));
            c6.setText(mQuestionLibrary5.getChoice6(mQuestionNumber));
            mAnswer = mQuestionLibrary5.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }

    }

}

