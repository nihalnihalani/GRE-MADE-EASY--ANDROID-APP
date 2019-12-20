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

public class Text extends AppCompatActivity {

    TextView text1;

    private static final String FORMAT = "%02d:%02d:%02d";

    int seconds , minutes;

    private QuestionLibrary16 mQuestionLibrary1 = new QuestionLibrary16();
    private QuestionLibrary17 mQuestionLibrary2 = new QuestionLibrary17();
    private QuestionLibrary18 mQuestionLibrary3 = new QuestionLibrary18();
    private QuestionLibrary19 mQuestionLibrary4 = new QuestionLibrary19();
    private QuestionLibrary20 mQuestionLibrary5 = new QuestionLibrary20();

    private TextView mQuestionView;
    RadioButton r1,r2,r3,r4,r5,r6,rb1,rb2;
    RadioGroup rg1,rg2;
    String activity="";
    ImageButton btn;
    private String mAnswer1="",mAnswer2="",varcourse1="",varcourse2="";
    private int mScore = 1;
    private int mQuestionNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        mQuestionView = (TextView) findViewById(R.id.textView2);
        text1=(TextView)findViewById(R.id.tvTimer2);
        r1 = (RadioButton) findViewById(R.id.radioButton21);
        r2 = (RadioButton) findViewById(R.id.radioButton20);
        r3 = (RadioButton) findViewById(R.id.radioButton19);
        r4 = (RadioButton) findViewById(R.id.radioButton24);
        r5 = (RadioButton) findViewById(R.id.radioButton23);
        r6 = (RadioButton) findViewById(R.id.radioButton22);
        rg1 = (RadioGroup) findViewById(R.id.rgroup1);
        rg2=(RadioGroup)findViewById(R.id.rgroup2);
        btn = (ImageButton) findViewById(R.id.imageButton10);
        r1.setChecked(true);
        r4.setChecked(true);
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
                Intent i1=new Intent(Text.this,TimeUpActivity.class);
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
                    int i = rg1.getCheckedRadioButtonId();

                    rb1 = (RadioButton) findViewById(i);
                    varcourse1 = rb1.getText().toString();
                    int j = rg2.getCheckedRadioButtonId();
                    while(j==-1)
                    {
                        Toast.makeText(Text.this,"Please select any option",Toast.LENGTH_SHORT).show();
                        j=rg2.getCheckedRadioButtonId();
                    }
                    rb2 = (RadioButton) findViewById(j);
                    varcourse2 = rb2.getText().toString();
                    if (mAnswer1.equals(varcourse1)&& mAnswer2.equals(varcourse2)) {
                        //This line of code is optiona
                       // Toast.makeText(Text.this, "correct"+String.valueOf(mScore), Toast.LENGTH_SHORT).show();
                        mScore++;
                        updateQuestion();
                    } else {
                        //Toast.makeText(Text.this, "wrong", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
                else {
                    Intent i = new Intent(Text.this, ResultActivity.class);
                    i.putExtra("score", mScore);
                    i.putExtra("actv",activity);
                    startActivity(i);
                }

            }
        });

    }

    private void updateQuestion(){
        if(activity.equals("1")) {
            mQuestionView.setText(mQuestionLibrary1.getQuestion1(mQuestionNumber));
            r1.setText(mQuestionLibrary1.getChoice1(mQuestionNumber));
            r2.setText(mQuestionLibrary1.getChoice2(mQuestionNumber));
            r3.setText(mQuestionLibrary1.getChoice3(mQuestionNumber));
            r4.setText(mQuestionLibrary1.getChoice4(mQuestionNumber));
            r5.setText(mQuestionLibrary1.getChoice5(mQuestionNumber));
            r6.setText(mQuestionLibrary1.getChoice6(mQuestionNumber));
            mAnswer1 = mQuestionLibrary1.getCorrectAnswer1(mQuestionNumber);
            mAnswer2 = mQuestionLibrary1.getCorrectAnswer2(mQuestionNumber);
            mQuestionNumber++;
        }
        else if(activity.equals("2")) {
            mQuestionView.setText(mQuestionLibrary2.getQuestion1(mQuestionNumber));
            r1.setText(mQuestionLibrary2.getChoice1(mQuestionNumber));
            r2.setText(mQuestionLibrary2.getChoice2(mQuestionNumber));
            r3.setText(mQuestionLibrary2.getChoice3(mQuestionNumber));
            r4.setText(mQuestionLibrary2.getChoice4(mQuestionNumber));
            r5.setText(mQuestionLibrary2.getChoice5(mQuestionNumber));
            r6.setText(mQuestionLibrary2.getChoice6(mQuestionNumber));
            mAnswer1 = mQuestionLibrary2.getCorrectAnswer1(mQuestionNumber);
            mAnswer2 = mQuestionLibrary2.getCorrectAnswer2(mQuestionNumber);
            mQuestionNumber++;
        }
       else  if(activity.equals("3")) {
            mQuestionView.setText(mQuestionLibrary3.getQuestion1(mQuestionNumber));
            r1.setText(mQuestionLibrary3.getChoice1(mQuestionNumber));
            r2.setText(mQuestionLibrary3.getChoice2(mQuestionNumber));
            r3.setText(mQuestionLibrary3.getChoice3(mQuestionNumber));
            r4.setText(mQuestionLibrary3.getChoice4(mQuestionNumber));
            r5.setText(mQuestionLibrary3.getChoice5(mQuestionNumber));
            r6.setText(mQuestionLibrary3.getChoice6(mQuestionNumber));
            mAnswer1 = mQuestionLibrary3.getCorrectAnswer1(mQuestionNumber);
            mAnswer2 = mQuestionLibrary3.getCorrectAnswer2(mQuestionNumber);
            mQuestionNumber++;
        }
        else if(activity.equals("4")) {
            mQuestionView.setText(mQuestionLibrary4.getQuestion1(mQuestionNumber));
            r1.setText(mQuestionLibrary4.getChoice1(mQuestionNumber));
            r2.setText(mQuestionLibrary4.getChoice2(mQuestionNumber));
            r3.setText(mQuestionLibrary4.getChoice3(mQuestionNumber));
            r4.setText(mQuestionLibrary4.getChoice4(mQuestionNumber));
            r5.setText(mQuestionLibrary4.getChoice5(mQuestionNumber));
            r6.setText(mQuestionLibrary4.getChoice6(mQuestionNumber));
            mAnswer1 = mQuestionLibrary4.getCorrectAnswer1(mQuestionNumber);
            mAnswer2 = mQuestionLibrary4.getCorrectAnswer2(mQuestionNumber);
            mQuestionNumber++;
        }
        else if(activity.equals("5")) {
            mQuestionView.setText(mQuestionLibrary5.getQuestion1(mQuestionNumber));
            r1.setText(mQuestionLibrary5.getChoice1(mQuestionNumber));
            r2.setText(mQuestionLibrary5.getChoice2(mQuestionNumber));
            r3.setText(mQuestionLibrary5.getChoice3(mQuestionNumber));
            r4.setText(mQuestionLibrary5.getChoice4(mQuestionNumber));
            r5.setText(mQuestionLibrary5.getChoice5(mQuestionNumber));
            r6.setText(mQuestionLibrary5.getChoice6(mQuestionNumber));
            mAnswer1 = mQuestionLibrary5.getCorrectAnswer1(mQuestionNumber);
            mAnswer2 = mQuestionLibrary5.getCorrectAnswer2(mQuestionNumber);
            mQuestionNumber++;
        }
    }

}



