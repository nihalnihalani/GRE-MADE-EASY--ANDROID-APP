package com.boredbees.gre2k17;

public class QuestionLibrary1 {

    private String mQuestions1 [] = {
            "5y^2",
            "35,043 × 25,430",
            "The least prime factor of 7^2",
            "15",
            "The diagonal of a rectangle"

    };
    private  String mQuestions2 []={
            "-y^2/7","35,430 × 25,043","The least prime factor of 2^7","The average (arithmetic mean) of a, b, c, and d is 7" +
            "The average (arithmetic mean) of 4a − 5c, b − 24, 8c − a,\n" +
            "and 3d + 2b",
            "Half the perimeter of the same rectangle"

    };

    private String mCorrectAnswers[] = {"Quantity A is Greater","Quantity A is Greater","Quantity A is Greater","Both are Equal","Quantity B is Greater"};




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
