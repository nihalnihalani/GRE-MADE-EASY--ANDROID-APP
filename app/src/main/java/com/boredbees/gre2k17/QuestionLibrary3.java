package com.boredbees.gre2k17;

public class QuestionLibrary3 {

    private String mQuestions1 [] = {
            "The number of kilograms in 44 pounds",
            "The number of seconds in 12 hours",
            "xy2z(x2z + yz2 - xy2)",
            "k is positive,remainder when k/7",
            "unit digit of 147^53"

    };
    private  String mQuestions2 []={
            "pounds The number of pounds in 44 kilograms","The number of minutes in 720 hours","x3y2z2 + xy3z3 - x2y4z","k is positive,remainder when (k+49)/7",
            "unit digit of 937^53"

    };

    private String mCorrectAnswers[] = {"Quantity B is Greater","Both are Equal","Both are Equal","Both are Equal","Both are Equal"};




    public String getQuestion1(int a) {
        String question = mQuestions1[a];
        return question;
    }


    public String getQuestion2(int a) {
        String question = mQuestions2[a];
        return question;
    }


    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
