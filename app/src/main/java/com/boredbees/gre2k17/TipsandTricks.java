package com.boredbees.gre2k17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TipsandTricks extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipsand_tricks);
        tv=(TextView)findViewById(R.id.textView18);
        tv.setText("Some Tips and Tricks"+"\n\n"+"Each of the two scored Verbal sections you will encounter on the GRE consists of approximately 20 questions in 30 minutes – obviously, that gives you (on average) 1.5 minutes per problem, but keep in mind that during that time you will also have to read and process several Reading Comprehension passages.\n" +
                "\n" +
                "Start early and study often! If you majored in philosophy and haven’t seen a polynomial since high school, be realistic regarding how much time it will take you to refresh your knowledge of algebra and geometry, and then how much time it will take you to study GRE-specific content (such as the Quantitative Comparison format) and practice under timed conditions and on actual Section Adaptive Tests. If it took you two years to learn algebra the first time around and you feel like you’ve forgotten it all, you can expect to need several months (at least) to get back in the game.\n" +
                "Similarly, if you majored in engineering and haven’t been regularly reading and processing college-level material in areas such as social science, literature, and historical analysis, it’s going to take awhile to become comfortable with and confident about that kind of material – not to mention the time it will take to substantially augment your vocabulary.\n" +
                "\n" +
                "Many students make the mistake of memorizing dictionary definitions of words without really understanding those definitions or being able to comfortably use those words in sentences.\n" +
                "\n" +
                "You want to learn words like “traduce” and “bonhomie” the same way you know words like “study” and “mistake” – that is, you can barely even remember a time when you didn’t know those words.\n" +
                "\n" +
                "While vocabulary lists, flashcards, and the like are important, some of the best vocabulary accrual occurs when you are reading difficult material (try Smithsonian, Harvard Alumni Magazine, Scientific American, MIT Technology Review, The Economist or Arts and Letters Daily), and you go look up a word you just read in context.\n" +
                "When you work through the Manhattan GRE Strategy Guides or the Official Guide to the GRE Revised General Test, do you work at your own pace, write in the book and on the geometry diagrams (rather than redrawing them), and do problems one or a handful at a time before taking a break or stopping to reflect?\n" +
                "\n" +
                "If so, your practice is nothing like the real experience of taking the real GRE. On the real test:\n" +
                "\n" +
                "Most people are incredibly pressed for time. We typically do not have time to check our work, or to run back over or reflect on our work.\n" +
                "\n" +
                "You have to redraw any geometry diagrams, and otherwise copy down relevant information to your paper.\n" +
                "\n" +
                "You only get one break, after writing two essays and completing your first two GRE math or verbal sections without stopping.\n" +
                "\n" +
                "ETS offers two free computer-based exams via the PowerPrep II software. These exams are delivered through a standalone software application (not Mac compatible). When you finish these practice exams, you will receive limited statistics — you’ll see which questions you got right and wrong, and you’ll be able to click on each question and see it again.\n"
                );
    }
}
