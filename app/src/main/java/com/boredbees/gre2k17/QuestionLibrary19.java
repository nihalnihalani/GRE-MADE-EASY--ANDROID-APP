package com.boredbees.gre2k17;

public class QuestionLibrary19 {

    private String mQuestions1 [] = {
            "Homo sapiens, the proud splitter of the atom, inventor of the electronic computer, (i)____ of the genetic code may be humbled by a lowly (ii)____ of the sewers and soils � the microbe.",
            " After centuries of (i)____, this philosopher's thesis is enjoying a surprising (ii)____ .",
            " A businessman must (i)____ his horizons; a (ii)____ attitude will get you nowhere in this age of global communications.",
            "In this biography we are given a glimpse of the young man (i)____ pursuing the path of the poet despite (ii)____ and rejection slips.",
            "Stephen was always (i)____ ; in fact, his own father described him as having a(n) (ii)____ vacillation."
    };
    private String mChoices1 [][] = {
            {"designer", "author", "decipherer"},
            {"limelight", "obscurity", "longevity"},
            {"limit", "foresee", "widen"},
            {"unsuccessfully","sporadically","doggedly"},
            {"indecisive","earnest","volatile"}

    };
    private String mChoices2 [][] = {
            {"creation", "denizen", "rodent"},
            {"renaissance", "decimation", "neglect"},
            {"parochial", "moderate", "comprehensive"},
            {"acclaim","disappointment","encouragement"},
            {"concern for","propensity for","aversion to"}

    };

    private String mCorrectAnswers1[] = {"decipherer","obscurity","widen","doggedly","indecisive"};
    private String mCorrectAnswers2[]={"denizen","renaissance","parochial","disappointment","propensity for"};




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
