package com.boredbees.gre2k17;

public class QuestionLibrary22 {

    private String mQuestions [] = {
            "Nothing evoked memories of her grandmother’s house like the _________ of scents associated with the holiday\n" +
                    "feast.",
            "Unlike the politician’s earlier evasions and equivocations, this latest statement is a _________ lie.",
            "While he says that he did not mean to kill, some feel that his actions are _________ murder.",
            "Although accommodating in person, George Orwell _________ defended his political positions in print.",
            "In 1905, there were only fourteen automobiles in the United States, yet, _________ enough, two of them ran into\n" +
                    "each other in St. Louis."
    };


    private String mChoices [][] = {
            {"paucity", "anamoly", "olio","melange","dearth","pilfering"},
            {"bald", "tacit", "overt","didactic","rhetorical","implicit"},
            {"prededed by", "on par with", "supreseded by","an homage to","an accrual of","tantamount to"},
            {"tenaciously", "obsequiosly", "inadvertently","doggedly","sycophantically","idiosyncratically"},
            {"justifiably","ironically","inevitably","deserved by","lamentably","ludicrously"}
    };



    private String mCorrectAnswers[] = {"oliomelange", "baldovert", "on par withtantamount to", "tenaciouslydoggedly","ironicallyinduicrously"};




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
