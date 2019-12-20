package com.boredbees.gre2k17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class QuestionLibrary6 {

    private String mQuestions [] = {
            "If an object travels at five feet per second, how many feet does it travel in one hour?",
            "What is the average (arithmetic mean) of all the multiples of ten from 10 to 190 inclusive?.",
            "A cubical block of metal weighs 6 pounds. How much will another cube of the same metal weigh if its sides are twice as long?",
            "( √2 - √3 )² =",
            "√5 percent of 5√5 ="

    };


    private String mChoices [][] = {
            {"30", "300", "720","18000"},
            {"90", "95", "100","105"},
            {"48", "32", "24","18"},
            {"5 - 2√6", "5 - √6", "1 - 2√6","1 - √2"},
            {"0.05","0.25","0.5","2.5"}
    };


    private String mCorrectAnswers[] = {"18000", "100", "48", "5 - 2√6","0.25"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a) {
        String choice0 = mChoices[a][3];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
