package com.boredbees.gre2k17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutGre extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_gre);
        tv=(TextView)findViewById(R.id.textView5);
        tv.setText("The Graduate Record Examination (GRE) is a standardized test that is an admissions requirement for most Graduate Schools in the United States. Created and administered by the Educational Testing Service (ETS) in 1949, the exam aims to measure verbal reasoning, quantitative reasoning, analytical writing, and critical thinking skills that have been acquired over a long period of learning and that are not entirely based on any specific field of study outside of the GRE itself. The GRE General Test is offered as a computer-based exam administered at prometric testing centers.\n" +
                "\n" +
                "Many universities and colleges in the US, Canada, UK, and other countries use Graduate Record Examination (GRE) scores as a criterion for admissions to their graduate-level courses. The ETS GRE (revised) General Test evaluates the test-taker’s overall knowledge and skills in three main segments—analytical writing, verbal reasoning, and quantitative reasoning. The scores indicate the candidate’s aptitude for taking up graduate studies in various disciplines.\n" +
                "AWA Essay 1: 30 min\n" +
                "AWA Essay 2: 30 min\n" +
                "Verbal (30 min) or Math (35 min) or Experimental\n" +
                "Verbal (30 min) or Math (35 min) or Experimental\n" +
                "Verbal (30 min) or Math (35 min) or Experimental\n" +
                "Verbal (30 min) or Math (35 min) or Experimental\n" +
                "Verbal (30 min) or Math (35 min) or Experimental\n" +
                "On the GRE, you will always get two scored Math sections, two scored Verbal sections, and one Experimental (unscored Math or Verbal) section, but the order varies. You can get two math or two verbal sections in a row. Conceivably, with the experimental section, you could get three of the same type of GRE section, though, based on raw probability, this would not be very likely to happen.\n" +
                "\n" +
                "The Verbal and Math sections will have 20 questions each if you are taking the computer-based exam.\n" +
                "\n" +
                "If you’re taking the paper-based exam, it will be 25 questions per section\n");
    }
}
