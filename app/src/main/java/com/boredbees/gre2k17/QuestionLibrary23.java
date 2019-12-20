package com.boredbees.gre2k17;

public class QuestionLibrary23 {

    private String mQuestions [] = {
            "In uncertain times, _________ theories often gain greater and faster adherence among the populace than proven\n" +
                    "ones do.",
            "Arthur Conan Doyle’s upstanding hero Sherlock Holmes engages in just as much clever deception as his nemesis,\n" +
                    "Professor Moriarty, proving that ___________ is not inherently evil.",
            "While the muted colors do suggest a certain sobriety, the overall effect is undeniably _________.",
            "Aghast at the indiscretion, the politician took a symbolic vow of _________, hoping that public attention to the\n" +
                    "matter would quickly wane.",
            "A petty man obsessed with—but in perpetual doubt about—his own power, he surrounded himself with\n" +
                    "subordinates who could best be described as _________."

    };


    private String mChoices [][] = {
            {"corroborated", "putative", "conjectural","assayed","irrefutable","irreconcilable"},
            {"immorality", "brilliance", "cunning","subterfuge","wrongdoing","judgment"},
            {"vivacious", "poignant", "dull","lackluster","mirthful","benign"},
            {"silence","chastity","openness","transparency","quietus","revenge"},
            {"sages", "myrmidons", "sycophants","quacks","ascetics","sirens"}
    };



    private String mCorrectAnswers[] = {"putativeconjectural", "cunningsuberfuge", "vivaciousmirthful", "silencequietus","myrmidonssycophants"};




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
