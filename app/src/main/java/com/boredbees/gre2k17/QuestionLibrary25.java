package com.boredbees.gre2k17;
public class QuestionLibrary25 {

    private String mQuestions [] = {
            "The director of the musical admitted that while he was very good with characterization, scenery, lighting, and\n" +
                    "music, choreography was not at all his __________.",
            "Though most technology used in the manufacture of bicycles is either decades old or adapted from other\n" +
                    "industries, the advent of carbon fiber frames brought with it genuine _________.",
            "The long history of such _________ Western religious traditions as Kaballah and theosophy suggest that it is\n" +
                    "wrong to associate mysticism only with the East.",
            "Many Enlightenment philosophers viewed Machiavelli’s book as a satire meant to expose and caricature the\n" +
                    "_________ claims to power of the very figures Machiavelli pretended to endorse.",
            "Employees who demonstrate too much alacrity in the workplace often find themselves being assigned work left\n" +
                    "unfinished by their more _________ co-workers."

    };


    private String mChoices [][] = {
            {"strong suit", "weakness", "forte","hobby","deficiency","pastime"},
            {"innovation", "antiquity", "flexibility","venerability","novelty","seriousness"},
            {"foreign", "devout", "exotic","esoteric","eccentric","arcane"},
            {"sarcastic", "specious", "spurious","squalid","stolid","stoic"},
            {"torpid", "solemn", "tepid","saturnine","sedulous","solicitous"}
    };



    private String mCorrectAnswers[] = {"strong suitforte", "innovationnovelty","esoterticarcane", "speciousspurious", "torpidsaturnine"};




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
