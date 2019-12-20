package com.boredbees.gre2k17;
public class QuestionLibrary5 {

    private String mQuestions1 [] = {
            "The sum of all the positive integer divisors of 15",
            "3 x 10³ + 2 x 10² + 10",
            "The greatest prime factor of 36",
            "Twice an odd integer greater than 6",
            "y/x"

    };
    private  String mQuestions2 []={
            "8","321 x 10","The greatest prime factor of 48","Three times an odd integer greater than 2",
            "q/p"
    };

    private String mCorrectAnswers[] = {"Quantity A is Greater","Both are Equal","Both are Equal","Relation can't be determined",
    "Quantity A is Greater"};




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
