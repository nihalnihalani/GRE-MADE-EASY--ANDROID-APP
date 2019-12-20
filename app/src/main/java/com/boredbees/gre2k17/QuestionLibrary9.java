package com.boredbees.gre2k17;

public class QuestionLibrary9 {

    private String mQuestions [] = {
            "What are the greatest and smallest positive differences between any of the factors of 210?",
            "If x^ay^bz^c equals the product of 154 and 56, z > y > x, and a > b > c, then what is the value of axbycz?",
            "If j is a multiple of 12, and k is a multiple of 21, then jk must be a multiple of which of the following?",
            "(4 × 100) + (6 × 1,000) + (2 × 1) + (3 × 10) =",
            "Which of the following is equal to 1/5 of the reciprocal of 0.004 percent?"

    };


    private String mChoices [][] = {
            {"400 and 2", "300 and 2", "209 and 1", "344 and 1"},
            {"2048", "1000", "1024","1056"},
            {"21", "28", "22","20"},
            {"6,432", "5,567", "4,456","4,459"},
            {"5,000","4,000","6,789","6,908"}
    };



    private String mCorrectAnswers[] = {"209 and 1", "2048", "28","6,432","5,000"};




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
