package com.boredbees.gre2k17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Syllabus extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        tv=(TextView)findViewById(R.id.textView17);
        tv.setText("GRE Test Syllabus 2017 - Verbal Reasoning:\n" +
                "\n" +
                "The Verbal Reasoning section measures a candidate's ability to:\n" +
                "a. Analyse and draw conclusions,understand and add value to incomplete data; identify the persception of the author;\n" +
                "b. Indentify vital points and differentiate between relevant and irrelevant points;\n" +
                "c. Understand and summarise the structure of a text;\n" +
                "d. Understand the meanings of words, sentences and entire texts;\n" +
                "e. Understand relationships among words and among concepts.\n" +
                "Candidates can get a detailed analysis of the Verbal reasoning section along with sample questions here\n" +
                " \n" +
                "GRE Test Syllabus 2017 - Quantitative Reasoning\n" +
                "The Quantitative Reasoning section measures a candidate's ability to:\n" +
                "a. Understand and analyse quantitative information\n" +
                "b. Interpret quantitative information correctly\n" +
                "c. Solve problems using mathematical models\n" +
                "d. Apply basic mathematical skills and concepts of arithmetic, algebra, geometry and data interpretation.\n" +
                "You can get a detailed analysis of Quantitative Reasoning here\n" +
                " \n" +
                "GRE Test Syllabus 2017 - Analytical Writing\n" +
                "The Analytical Writing section measures a candidate's ability to:\n" +
                "a. Articulate complex ideas effectively and with clarity\n" +
                "b. Support ideas with relevant reasons and examples\n" +
                "c. Examine claims and accompanying evidence\n" +
                "d. Sustain a well-focused, coherent discussion\n" +
                "You can get a detailed analysis of Analytical Writing here\n" +
                " \n" +
                "The GRE 2017 Test Syllabus for the Subject test format:\n" +
                "Biochemistry, Cell and Molecular Biology\n" +
                "Biology\n" +
                "Chemistry\n" +
                "Literature in English\n" +
                "Mathematics\n" +
                "Physics\n" +
                "Psychology\n" +
                " \n" +
                "\n" +
                " ");
    }
}
