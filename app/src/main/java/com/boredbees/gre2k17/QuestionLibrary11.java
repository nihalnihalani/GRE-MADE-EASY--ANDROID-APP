package com.boredbees.gre2k17;

public class QuestionLibrary11 {

    private String comprehension []={"During an economic depression, it is common for food prices to increase even as incomes decrease.\n" +
            "Surprisingly, however, researchers determined that during a depression, for every 5 percent increase in the\n" +
            "cost of bread, the lowest socioeconomic class actually increases the amount of bread purchased per capita\n" +
            "by 3 percent."
            ,"Bedbug infestations have been a problem in major cities for years. The pesticide DDT has been found to\n" +
            "be useful in killing bedbugs. However, DDT was banned in the United States and has been replaced by\n" +
            "weaker pesticides. Thus, there is no effective means for eradicating bedbugs in the United States."
            ,"In 1977, the Community Reinvestment Act was passed for the purpose of reducing discriminatory credit\n" +
            "practices in low-income neighborhoods. The act required Federal financing supervisory agencies to use their\n" +
            "authority to encourage lending institutions to meet the credit needs of all borrowers in their communities. The\n" +
            "CRA had little impact until 1993,when the Department of Housing and Urban Development (HUD) initiated legal proceedings against lenders\n" +
            "who declined too many applications from minority borrowers.\n" +
            "Some argue that, while providing equal access to credit is an important aim, pressure on lenders from\n" +
            "HUD led to practices that later caused those same lenders to be assailed as “predatory.” In Housing Boom and\n" +
            "Bust, economist Thomas Sowell wrote that the CRA, far from being as benign as it appeared, was based on a flawed assumption: that government officials were qualified to\n" +
            "tell banks how to lend the money entrusted to them by depositors and investors."
            ,"While new census data reveals that unemployment numbers are even direr than was previously suspected,\n" +
            "it is not clear that the forecast for American entrepreneurship is equally alarming. An article in a major\n" +
            "national newspaper suggests that the contraction in hiring at existing companies might result in more new\n" +
            "companies being founded. College graduates,unable to find traditional jobs, instead opt to start their own businesses. Where a recession may seem an\n" +
            "unpropitious time for such a historically risky endeavor, with no better options, would-be entrepreneurs have\n" +
            "little to lose. Unfortunately, this situation does not necessarily impact the economy positively. Though the\n" +
            "average number of new businesses started per year has been higher during the recession than it was before, the\n" +
            "proportion of high-value businesses founded each year has declined. So even if a business manages to stay solvent, it may not bring significant\n" +
            "returns. Also, because of an inevitable dearth of angel investors and venture capitalists, many new\n" +
            "entrepreneurs are putting their own money on the line. In certain ways, the choice between accepting a\n" +
            "traditional job and starting a business is not unlike the choice between renting and buying property. The latter\n" +
            "requires a significant initial outlay and carries heavier risks, but the rewards can be equally substantial.",
            "According to Mercy Amba Oduyoye in Daughters of Anowa: African Women and Patriarchy, the\n" +
                    "women of the Asante people of Ghana participated in war as nurses or in providing supplies, but only those who\n" +
                    "had not yet reached or who were past childbearing age. If such women died in battle, they died “as individuals\n" +
                    "and not as potential sources of human life.”As such, many old women engaged in valiant acts, sometimes sacrificing their own lives, to defend those they\n" +
                    "had given life to."};
    private String mQuestions [] = {
            "Which of the following hypotheses best accounts for the researchers’ findings?",
            "Which of the following, if true, most weakens the conclusion?",
            "Which of the following can be inferred about discriminatory credit practices?",
            "According to the passage, the reason that many college graduates are choosing to launch their own companies in the\n" +
                    "present economic climate is that",
            "Which of the following can be inferred from the passage?"

    };
    private String mChoices [][] = {
            {"Not all food costs increase during a depression; some food items actually become less expensive.", "Because bread consumption does not increase by the same percentage as the cost does, people are\n" +
                    "likely consuming more of other food items to compensate.", "When incomes decrease, people are typically forced to spend a larger proportion of their income on\n" +
                    "basic needs, such as food and housing.","People who suddenly cannot afford more expensive foods, such as meat, must compensate by\n" +
                    "consuming more inexpensive foods, such as grains."},
            {"Bedbugs resemble other small insects in their appearance and behavior.", "Bedbugs have largely been eradicated in other parts of the world.", "Some treatments that do not include DDT have proven effective against bedbugs in other parts of the\n" +
                    "world.","Bedbugs are resistant to the types of pesticides used to treat cockroach and ant infestations."},
            {"They are more common in middle-income neighborhoods than in high-income neighborhoods.", "Legislators who voted for the CRA did so because they were opposed to such practices.", "Critics allege that attempts to combat such practices can have unintended consequences.","None of these"},
            {"they are hampered by the difficulty of finding outside investors", "they cannot easily land positions typically open to workers of their experience", "the prevalence of low-value companies has increased","they are forced to decide between renting and buying property"},
            {"The deaths of Asante women of childbearing age were lamented more than were the deaths of other\n" +
                    "women.","Older Asante women were more courageous than younger Asante women.","Some of those who worked as nurses or in providing supplies died in battle.","Women of childbearing age were accorded special status above other women and men."}
    };

    private String mCorrectAnswers[] = {"People who suddenly cannot afford more expensive foods, such as meat, must compensate by\n" +
            "consuming more inexpensive foods, such as grains.","Some treatments that do not include DDT have proven effective against bedbugs in other parts of the\n" +
            "world.","Critics allege that attempts to combat such practices can have unintended consequences.","they cannot easily land positions typically open to workers of their experience","Some of those who worked as nurses or in providing supplies died in battle."};




    public String getComprehension(int a) {
        String question = comprehension[a];
        return question;
    }
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
