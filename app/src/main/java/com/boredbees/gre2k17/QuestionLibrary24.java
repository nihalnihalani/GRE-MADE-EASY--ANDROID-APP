package com.boredbees.gre2k17;

public class QuestionLibrary24 {

    private String mQuestions [] = {
            "While traveling to the spa’s remote location could be hectic, visitors to the spa more than made up for the stress\n" +
                    "by unwinding in a supremely _________ environment",
            "In a place rife with both poverty and crime, some cautioned the young student that to _________ about with his\n" +
                    "fancy phone and designer clothing was only to invite trouble.",
            "Just months from retirement, the disgraced executive was forced to make _________ exit from the company.",
            "_________ in scandal, the company could regain favor with customers only through mass firings of guilty\n" +
                    "executives.",
            "While kidney stones are known to produce a truly ___________ sensation, often compared to the agony of\n" +
                    "childbirth, they are almost never fatal."

    };

    private String mChoices [][] = {
            {"effusive", "pacific", "duplicitous","censorious","placid","blithe"},
            {"sprint", "gallivant", "tergiversate","traipse","digress","equivocate"},
            {"a peppery", "a triumphant", "a boorish","an ignominious","a defiled","an unseemly"},
            {"Wallowing", "Stoic", "Bogged down","Resplendent","Mired","Besotted"},
            {"anodyne", "inoffensive", "painstaking","tortuous","excruciating","torturous"}
    };



    private String mCorrectAnswers[] = {"pacificplacid", "gallivanttraipse", "an ignominiousan unseemly", "boggeddownmired","excruciatingtorturous"};




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
        String choice3 = mChoices[a][3];
        return choice3;
    }
    public String getChoice5(int a) {
        String choice4 = mChoices[a][4];
        return choice4;
    }
    public String getChoice6(int a) {
        String choice5 = mChoices[a][5];
        return choice5;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
