package com.boredbees.gre2k17;

public class QuestionLibrary18 {

    private String mQuestions1 [] = {
            "Some critics maintain that Tennyson's poetry is uneven, ranging from the (i)____ to the (ii)____.",
            "One (i)____ of the new scheme is that it might actually (ii)____ just those applicants that it was intended to encourage.",
            " Corruption is (i)____ our society; the integrity of even senior officials is (ii)____.",
            "People from all over the world are sent by their doctors to breathe the pure, (i)____ air in this mountain region to counteract the (ii)____ effects of their urban existence.",
            "As were many colonial administrators, Gregory was (i)____ in his knowledge of the grammar of the local language, though his accent was almost (ii)____ ."

    };
    private String mChoices1 [][] = {
            {"succinct", "trite", "sublime"},
            {"attraction", "highlight", "drawback"},
            {"rife in", "endangered throughout", "alien to\tBlank (ii)"},
            {"insalubrious","soporific","invigorating"},
            {"deficient","faultless","erratic"}


    };
    private String mChoices2 [][] = {
            {"laconic", "sonorous", "inspired"},
            {"induce", "daunt", "attract"},
            {"suspect", "intact", "unquestioned"},
            {"deracinating","stimulating","debilitating"},
            {"unintelligible","germane","stentorian"}

    };

    private String mCorrectAnswers1[] = {"trite","drawback","rife in","invigorating","faultless"};
    private String mCorrectAnswers2[]={"inspired","daunt","suspect","debilitating","unintelligible"};




    public String getQuestion1(int a) {
        String question = mQuestions1[a];
        return question;
    }


    public String getChoice1(int a) {
        String question = mChoices1[a][0];
        return question;
    }
    public String getChoice2(int a) {
        String question = mChoices1[a][1];
        return question;
    }
    public String getChoice3(int a) {
        String question = mChoices1[a][2];
        return question;
    }
    public String getChoice4(int a) {
        String question = mChoices2[a][0];
        return question;
    }
    public String getChoice5(int a) {
        String question = mChoices2[a][1];
        return question;
    }
    public String getChoice6(int a) {
        String question = mChoices2[a][2];
        return question;
    }


    public String getCorrectAnswer1(int a) {
        String answer = mCorrectAnswers1[a];
        return answer;
    }
    public String getCorrectAnswer2(int a) {
        String answer = mCorrectAnswers2[a];
        return answer;
    }



}
