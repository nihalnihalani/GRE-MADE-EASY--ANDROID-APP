package com.boredbees.gre2k17;

public class QuestionLibrary10 {

    private String mQuestions [] = {
            "If a certain vitamin pill has 400 milligrams of magnesium, then how many grams of magnesium are in a bottle of 500 vitamin pills?",
            "Mei is building a garden in the shape of an isosceles triangle with one side of 10. If the perimeter of the garden is 32, which of the\n" +
                    "following is a possible area of the garden?",
            "In a triangle, one angle is twice as large as the smallest angle, and another angle is three times as large as the smallest angle. What is\n" +
                    "the measure of the largest angle?",
            "Given four rods of length 1 meter, 3 meters, 5 meters, and 7 meters, how many di\uDBC0\uDC43erent triangles can be made using one rod for each\n" +
                    "side?",
            "How much greater, in square inches, is the area of a square with a diagonal of 8 inches than the area of a square with a diagonal of 4\n" +
                    "inches?"

    };


    private String mChoices [][] = {
            {"2", "200", "2000","23"},
            {"32", "48", "54","65"},
            {"56", "43", "45","90"},
            {"32", "5", "3","1"},
            {"24","45","54","56"}
    };



    private String mCorrectAnswers[] = {"200", "48", "90", "1","24"};




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
        String choice0 = mChoices[a][3];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
