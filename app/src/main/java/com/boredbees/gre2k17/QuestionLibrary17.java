package com.boredbees.gre2k17;

public class QuestionLibrary17 {

    private String mQuestions1 [] = {
            " Rock music has often been credited with (or decried for) containing (i)____ messages, purportedly to influence the minds of (ii)____ listeners.",
            "Today Wegener's theory is (i)____ ; however, he died an outsider treated with (ii)____ by the scientific establishment.",
            "If there is nothing to absorb the energy of sound waves, they travel on (i)____ , but their intensity (ii)____ as they travel further from their source.",
            "The intellectual flexibility inherent in a multicultural nation has been (i)____ in classrooms where emphasis on British-American literature has not reflected the cultural (ii)____ of our country.\n" +
                    "\n",
            "The formerly (i)____ waters of the lake have become (ii)____. So even though the waters are teeming with life, fish are no longer visible from the surface."

    };
    private String mChoices1 [][] = {
            {"criminal", "overt", "subliminal"},
            {"unsupported", "unchallenged", "undervalued"},
            {"indefinitely", "erratically", "slowly"},
            {"inculcated","encouraged","stifled"},
            {"murky","stagnant","pellucid"}



    };
    private String mChoices2 [][] = {
            {"preordained", "unsuspecting", "covert"},
            {"reverence", "disdain", "impartiality"},
            {"alleviates", "diminishes", "mitigates"},
            {"unanimity","diversity","aspirations"},
            {"tranquil","verdant","turbid"}


    };

    private String mCorrectAnswers1[] = {"subliminal","unchallenged","indefinitely","stifled","pellucid"};
    private String mCorrectAnswers2[]={"unsuspecting","disdain","diminishes","diversity","turbid"};




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
