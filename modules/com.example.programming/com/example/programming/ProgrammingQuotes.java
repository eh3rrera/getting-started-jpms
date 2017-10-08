package com.example.programming;

import java.util.Random;
import com.example.quote.Quote;

public class ProgrammingQuotes implements Quote {
    private String[] quotes = new String[] {
        "\"To iterate is human, to recurse divine.\"\n" +
                "- L. Peter Deutsch",
        "\"Don't worry if it doesn't work right. If everything did, you'd be out of a job.\"\n" +
                "- Mosher's Law of Software Engineering",
        "\"Good design adds value faster than it adds cost.\"\n" +
                "- Thomas C. Gale",
        "\"Talk is cheap. Show me the code.\"\n" +
                "- Linus Torvalds",
        "\"I don't care if it works on your machine! We are not shipping your machine!\"\n" +
                "- Vidiu Platon",
    };
    private Random rand = new Random();

    private int getRandomIndex() {
        return rand.nextInt(quotes.length);
    }

    public String getQuote() {
        return quotes[getRandomIndex()];
    }

    public static void main(String args[]) {
        System.out.println(new ProgrammingQuotes().getQuote());
    }
}