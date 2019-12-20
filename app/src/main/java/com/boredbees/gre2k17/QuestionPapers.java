package com.boredbees.gre2k17;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuestionPapers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_papers);
    }
    public void browser1(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://entrance-exam.net/forum/attachments/question-papers/3568d1290107785-gre-exam-download-previous-years-question-papers-gre-sample-paper-1.pdf"));
        startActivity(i);
    }
    public void browser2(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://entrance-exam.net/forum/attachments/question-papers/3569d1290107793-gre-exam-download-previous-years-question-papers-gre-sample-paper-2.pdf"));
        startActivity(i);
    }
    public void browser3(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://entrance-exam.net/forum/attachments/question-papers/3570d1290107804-gre-exam-download-previous-years-question-papers-gre-sample-paper-3.pdf"));
        startActivity(i);
    }
    public void browser4(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://entrance-exam.net/forum/attachments/question-papers/3571d1290107811-gre-exam-download-previous-years-question-papers-gre-sample-paper-4.pdf"));
        startActivity(i);
    }
    public void browser5(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://entrance-exam.net/forum/attachments/question-papers/3572d1290107821-gre-exam-download-previous-years-question-papers-gre-sample-paper-5.pdf"));
        startActivity(i);
    }
    public void browser6(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://entrance-exam.net/forum/attachments/question-papers/3573d1290107827-gre-exam-download-previous-years-question-papers-gre-sample-paper-6.pdf"));
        startActivity(i);
    }
    public void browser7(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://entrance-exam.net/forum/attachments/question-papers/3574d1290107840-gre-exam-download-previous-years-question-papers-gre-sample-paper-7.pdf"));
        startActivity(i);
    }
    public void browser8(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://entrance-exam.net/forum/attachments/question-papers/3575d1290107851-gre-exam-download-previous-years-question-papers-gre-sample-paper-8.pdf"));
        startActivity(i);
    }
    public void browser9(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://entrance-exam.net/forum/attachments/question-papers/3576d1290107859-gre-exam-download-previous-years-question-papers-gre-sample-paper-9.pdf"));
        startActivity(i);
    }
    public void browser10(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://entrance-exam.net/forum/attachments/question-papers/3577d1290107866-gre-exam-download-previous-years-question-papers-gre-sample-paper-10.pdf"));
        startActivity(i);
    }
}
