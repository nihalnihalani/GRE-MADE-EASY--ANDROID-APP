package com.boredbees.gre2k17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        tv=(TextView)findViewById(R.id.textView7);
        tv.setText("About Us:\n" +
                "\tWe are a small team of developers and interns at BOREDBEES TECH SOLUTIONS INDIA (P) LTD.\n" +
                "\n" +
                "Team Members:\n" +
                " \n" +
                " Apramey Bhat \n" +
                "\tDeepak Joshi\n" +
                "\tKarthik Gayakwad\n" +
                "\tKiran Charantimath\n" +
                "\tManu S Rao\n" +
                "\tNihal Nihalani\n\n" +
                "Team Contact:\n"+
                "\tMail : team.xcoders@gmail.com\n\n"+
                "\n" +
                "Contact Information :\n\n BOREDBEES TECH SOLUTIONS INDIA (P) LTD.\n" +
                "\n" +
                "Address: \n 3rd floor, B-Block, IT Park, Opp. Indira Glass House,  Hubli - 580029.\n" +
                "\tPhone No.: (0836)-4255699\n" +
                "\tMail : boredbees@gmail.com\n");
    }
}
