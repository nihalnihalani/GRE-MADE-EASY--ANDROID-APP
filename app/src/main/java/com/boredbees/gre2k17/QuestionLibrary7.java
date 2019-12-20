package com.boredbees.gre2k17;

public class QuestionLibrary7 {

    private String mQuestions [] = {
            "If 3x + 2(x + 2) = 2x + 16, then x =",
            "If 3 less than twice a certain number is equal to 2 more than 3 times the number, then 5 less than 5 times the number is",
            "A sports league encourages collaboration by awarding 3 points for each goal scored without assistance and 5 points for each goal\n" +
                    "scored with assistance. A total of 48 points were scored by a team in a single game. Which of the following CANNOT be the number\n" +
                    "of goals scored without assistance by this team in this game?",
            "At Betty’s Bagels, bagels normally cost x each, but with purchases of each dozen the customer receives a discount of 1.40 dollars. Billy\n" +
                    "buys 56 bagels and calculates that he spends an average of 90 cents per bagel. What is the value of x?",
            "The New Age Entertainment Company produces x mood rings at a cost, in cents, of 80x + 9,000. These x mood rings can be sold for a\n" +
                    "price, in cents, of 260x. What is the least value of x for which the New Age Entertainment Company does not lose money?"

    };


    private String mChoices [][] = {
            {"3", "4", "20/3","10"},
            {"-30", "-20", "-5","0"},
            {"1", "6", "11","12"},
            {"$1.00", "$1.40", "$1.60","$2.20"},
            {"107","82","63","50"}
    };



    private String mCorrectAnswers[] = {"-30", "676", "11", "$1.00","50"};




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
