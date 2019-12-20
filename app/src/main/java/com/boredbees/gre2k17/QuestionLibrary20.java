package com.boredbees.gre2k17;

public class QuestionLibrary20 {

    private String mQuestions1 [] = {
            " Our present accountant is most (i)____ ; unlike the previous (ii)____ incumbent, he has never made a mistake in all the years that he has worked for the firm",
            "The model paraded in front of the celebrities with (i)____ ; it was impossible to tell that this was her (ii)____.",
            "It will be hard to (i)____ Leonid now that you have so (ii)____ him.",
            "The journalist (i)____ the efforts of the drug squad to control drug peddling, claiming that they had actually (ii)____ the problem.\n" +
                    "\n",
            "Even though the auditors (i)____ the accountant, his reputation, hitherto unblemished, was (ii)____ by the allegations of fraud.\n" +
                    "\n"

    };
    private String mChoices1 [][] = {
            {"pusillanimous", "punctilious", "asinine"},
            {"trepidation", "consternation", "panache"},
            {"indict", "mollify", "lampoon"},
            {"commended","deprecated","noted"},
            {"indicted","betrayed","vindicated"}


    };
    private String mChoices2 [][] = {
            {"craven", "unreliable", "mercenary"},
            {"first assignment", "normal gait", "real persona"},
            {"subjugated", "incensed", "bemused"},
            {"delineated","mollified","exacerbated"},
            {"enhanced","tarnished","condoned"}

    };

    private String mCorrectAnswers1[] = {"punctilious","panache","mollify","deprecated","vindicated"};
    private String mCorrectAnswers2[]={"unreliable","first assignment","incensed","exacerbated","tarnished"};




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
