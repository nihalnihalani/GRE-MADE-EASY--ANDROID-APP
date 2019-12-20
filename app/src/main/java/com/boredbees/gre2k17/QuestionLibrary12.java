package com.boredbees.gre2k17;

public class QuestionLibrary12 {

    private String mQuestions []={"The primary purpose of the passage is to","Based on the information in the passage, which of the following would Kincaid most likely agree with?","The primary purpose of the passage is to","Which of the following, not mentioned in the passage, would qualify as an example of reverse redlining as defined\n" +
            "in the passage?","Based on the information in the passage, the author of the passage would most likely agree that"};
    private String comprehension[] = {
            "A supernova is a brief stellar explosion so luminous that it can briefly outshine an entire galaxy. While\n" +
                    "the explosion itself takes less than fifteen seconds, supernovae take weeks or months to fade from view;\n" +
                    "during that time, a supernova can emit an amount of energy equivalent to the amount of energy the sun is\n" +
                    "expected to radiate over its entire lifespan.Supernovae generate enough heat to create heavy elements, such as mercury, gold, and silver. Although\n" +
                    "supernovae explode frequently, few of them are visible (from Earth) to the naked eye.\n" +
                    "In 1604 in Padua, Italy, a supernova became visible, appearing as a star so bright that it was visible in\n" +
                    "daylight for more than a year. Galileo, who lectured at the university, gave several lectures widely attended by\n" +
                    "the public. The lectures not only sought to explain the origin of the “star” (some posited that perhaps it was merely “vapour near the earth”), but seriously undermined the\n" +
                    "views of many philosophers that the heavens were unchangeable. This idea was foundational to a worldview\n" +
                    "underpinned by a central and all-important Earth, with celestial bodies merely rotating around it.",
            "A Small Place is Jamaica Kincaid’s memoir of growing up in Antigua as well as an indictment of the\n" +
                    "Antiguan government and Britain’s colonial legacy in Antigua. Kincaid blames colonial rule for many of\n" +
                    "Antigua’s current problems, including drug dealing and selling off land for tourist properties. Kincaid’s critics\n" +
                    "question why, if the British are responsible for the Antiguan government’s corruption, the British government itself isn’t more corrupt. Kincaid has responded\n" +
                    "that there must have been some good people among the British, but that they stayed home.",
            "By 1784, Wolfgang Amadeus Mozart was internationally renowned as the composer of The Marriage of\n" +
                    "Figaro, and consequently received a commission from the Prague Opera House to compose another opera.\n" +
                    "The resulting product was Don Giovanni, which tells the tale of a criminal and seducer who nevertheless\n" +
                    "evokes sympathy from audiences, and whose behavior fluctuates from moral crisis to hilarious escapade.\n" +
                    "While Don Giovanni is widely considered to be Mozart’s greatest achievement, eighteenth century\n" +
                    "audiences in Vienna — Mozart’s own city — were ambivalent at best. The opera mixed traditions of moralism\n" +
                    "with those of comedy — a practice heretofore unknown among the composer’s works — creating a production\n" +
                    "that was not well liked by conservative Viennese audiences. Meanwhile, however, Don Giovanni was performed to much acclaim throughout Europe.",
            "In the 1960’s, Northwestern University sociologist John McKnight coined the term redlining, the\n" +
                    "practice of denying service, or charging more for service, to customers in particular geographic areas, areas\n" +
                    "often determined by the racial composition of the neighborhood. The term came from the practice of banks\n" +
                    "outlining certain areas in red on a map — within the red outline, banks refused to invest. With no access to mortgages, residents within the red\n" +
                    "line suffered low property values and landlord abandonment; buildings abandoned by landlords were then likely\n" +
                    "to become centers of drug dealing and other crime, thus further lowering property values.\n" +
                    "Redlining in mortgage lending was made illegal by the Fair Housing Act of 1968, which prohibited such discrimination based on race, religion, gender, familial status, disability, or ethnic origin, and\n" +
                    "by community reinvestment legislation in the 1970’s. However, redlining may have continued in less explicit\n" +
                    "ways, and can also take place in regards to constrained access to health care, jobs, insurance, and more. Even\n" +
                    "today, some credit card companies send different offers to homes in different neighborhoods, and some auto\n" +
                    "insurance companies offerdifferent rates based on zip code.\n" +
                    "Reverse redlining occurs when predatory businesses specifically target minority consumers for the\n" +
                    "purpose of charging them more than would usually be charged to a consumer of the majority group. Redlining\n" +
                    "can lead to reverse redlining — if a retailer refuses to serve a certain area based on the ethnic-minority composition of the area, people in that area can fall prey to opportunistic smaller retailers who sell inferior goods at higher prices.",
            "Premastication is the practice of a mother pre-chewing food before feeding it, mouth-to-mouth, to her\n" +
                    "baby. While germophobic Western society eschews this practice, it is not only common in the developing\n" +
                    "world, but provides benefits to a developing baby. Babies are not born with digestive bacteria; they get some\n" +
                    "from passing through the birth canal, but continue to encounter the beneficial bacteria during breastfeeding and while being handled, in general, by adults.\n" +
                    "Throughout most of human history, babies also received antibodies and digestive bacteria from the mother’s\n" +
                    "saliva, transmitted via premasticated food. In some cultures, fathers also premasticate food for babies;\n" +
                    "sometimes even entire family groups will do this – a toddler at a family meal might wander from person to\n" +
                    "person, being fed by many adults."

    };
    private String mChoices [][] = {
            {"give the history of supernovae", "describe a shift in thought as a result of a natural event", "juxtapose two opposing views about supernovae","corroborate the view that the earth is not central to the universe"},
            {"A government can bring about a degree of corruption abroad that the government itself does not suffer\n" +
                    "from at home.", "Britain has caused corruption in governments throughout its former colonial empire.", "Selling off land for tourism-related purposes is a problem for Antigua.","Both A and C"},
            {"relate the story of a somewhat likable antihero", "discuss how a work of art has been met by diverging responses", "give a history of the work of Mozart","make a case for the renown of Don Giovanni"},
            {"A bank refuses to offer mortgages to consumers in certain neighborhoods.", "Residents of low-income neighborhoods are less likely to be hired for positions than residents of\n" +
                    "higher-income neighborhoods, even when the applicants have the same qualifications.", "Police respond to reports of crimes more quickly in some neighborhoods than in others.","A grocery store in a low-income neighborhood sells low-quality produce for high prices, knowing\n" +
                    "that most residents do not have the ability to buy elsewhere."},{"Germophobia can contribute to depriving babies of a health benefit.","Premasticating food for babies is done only in the developing world.","Adult saliva has benefits for babies in addition to the transmission of beneficial digestive bacteria.","Both A and C"}
    };

    private String mCorrectAnswers[] = {"describe a shift in thought as a result of a natural event","Both A and C","discuss how a work of art has been met by diverging responses","A grocery store in a low-income neighborhood sells low-quality produce for high prices, knowing\n" +
            "that most residents do not have the ability to buy elsewhere.","Both A and C"};




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
