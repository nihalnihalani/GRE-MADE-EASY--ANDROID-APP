package com.boredbees.gre2k17;

public class QuestionLibrary16 {

    private String mQuestions1 [] = {
            "Ricks has written extensively not only on the poetry of such (i)____ figures in English poetry as Milton and Housman, but also on the less obviously (ii)____ lyrics of Bob Dylan.",
            "The publishers, unwilling to (i)____ the entire risk, insisted that the author pay half the cost of the initial print run of his (ii)____ new book.",
            "Science advances (i)____ as (ii)____ change abruptly and we are forced to stop and reorient ourselves to view old information in new ways.",
            "As Gerard (i)____ the (ii)____ that greeted his work, he became increasingly smug.",
            "The (i)____ and virtuosity required of a jazz player make jazz seem to lack (ii)____; this apparently amorphous flow can make it hard for people with traditional expectations of musical stability to acquire a taste for this genre.\n" +
                    "\n"

    };
    private String mChoices1 [][] = {
            {"obscurantist ", "arcane", "established"},
            {"hedge", "shoulder", "mitigate"},
            {"exponentially", "inexorably", "jerkily"},
            {"repudiated","humbly accepted","basked in"},
            {"controlled playing","inventiveness","emotional distance"}


    };
    private String mChoices2 [][] = {
            {"canonical", "popular", "judicious"},
            {"unexceptionable", "controversial", "jaundiced"},
            {"paradigms", "axioms", "continuities"},
            {"accolades","opprobrium","lack of interest"},
            {"inherent structure","underlying rhythm","controlled emotions"}

    };

    private String mCorrectAnswers1[] = {"established","shoulder","jerkily","basked in","inventiveness"};
    private String mCorrectAnswers2[]={"canonical","controversial","paradigms","raaccoladeshul","inherent structure"};




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
