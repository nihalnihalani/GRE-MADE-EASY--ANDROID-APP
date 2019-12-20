package com.boredbees.gre2k17;

public class QuestionLibrary2 {

    private String mQuestions1 [] = {
            "Fair coins tossed the chances of getting 3 heads",
            "Area of a rectangle of perimeter 10",
            "17(6) + 3(6)",
            "14 - 3(4 - 6)",
            "(30,000,000)(2,000,000)"

    };
    private  String mQuestions2 []={
            "Fair coins tossed the chances of getting no heads","Area of a triangle with base 6 and height 3","6(17) + 6(3)","(4)(-3)(2)(-1)",
            "(15,000,000)(4,000,000)"

    };

    private String mCorrectAnswers[] = {"Both are Equal","Quantity B is Greater","Both are Equal","Quantity B is Greater","Both are Equal"};




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
