package com.boredbees.gre2k17;

public class QuestionLibrary4 {

    private String mQuestions1 [] = {
            "5x^3",
            "75,410 rounded to the nearest hundred",
            "Twice the volume of a cube of side 1",
            "-1(-1)",
            "The sum of all the integers from -10 to 12 inclusive."

    };
    private  String mQuestions2 []={
            "(5x)^3","75,410 rounded to the nearest thousand","Volume of a cube of side 2","-1 +(-1)","23"
    };

    private String mCorrectAnswers[] = {"Relation can't be determined","Quantity A is Greater","Quantity B is Greater","Both are Equal"
    ,};




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
