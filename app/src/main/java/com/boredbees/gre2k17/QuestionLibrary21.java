package com.boredbees.gre2k17;

public class QuestionLibrary21 {

    private String mQuestions [] = {
            "While the colonists would eventually push westward, first, they were in for a long, difficult winter, and the main\n" +
                    "challenge was to _________ their existing resources.",
            "Emblematic of the slaughter of the First World War, 60,000 British soldiers died for naught on the first day of the\n" +
                    "battle of the Somme, literally consumed into a stew of blood and _________.",
            "The daily routine of responding to lobbyists and exchanging polemics with intransigent political opponents seemed\n" +
                    "at odds with the president’s _________ tendencies.",
            "A field trip was arranged so that this troupe of _________ dancers could observe the real masters of their art.",
            "After a long, hard practice in the summer sun, the players were visibly _________."

    };


    private String mChoices [][] = {
            {"sell", "peddle", "steward","upend","husband","procure"},
            {"grief", "gore", "Steel","bullets","carnage","anguish"},
            {"tenacious", "idealistic", "dialectical","contentious","quixotic","altruistic"},
            {"seasoned", "fledgling", "expert","torpid","novice","lithe"},
            {"flagging", "hale", "lissome","loathsome","vigorous","enervated"}
    };



    private String mCorrectAnswers[] = {"stewardhusband", "gorecarnage", "idealisticquixotic", "fledglingnovice","flaggingenervated"};




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
