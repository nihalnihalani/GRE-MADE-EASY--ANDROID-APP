package com.boredbees.gre2k17;

public class QuestionLibrary8 {

    private String mQuestions [] = {
            "Which of the following CANNOT be the sum of two prime integers?",
            "If r is an integer multiple of 8, then which of the following could NOT be divisible by r?",
            "Which of the following integers has both 12 and 17 as factors?",
            "How many positive integers less than 20 are factors of 96?",
            "A number divisible by a positive even prime number must be"

    };


    private String mChoices [][] = {
            {"7", "19", "23","31"},
            {"20", "500", "400","420"},
            {"150", "112", "23","204"},
            {"8", "4", "5","2"},
            {"prime","even","odd","non prime"}
    };



    private String mCorrectAnswers[] = {"23", "420", "204", "8","even"};




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
