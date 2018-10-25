package com.gramcha.model;

/**
 * Created by gramachandran on 26/10/18.
 */
public class SoundsLikeResult {
    private int score;

    private String word;

    private int numSyllables;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getNumSyllables() {
        return numSyllables;
    }

    public void setNumSyllables(int numSyllables) {
        this.numSyllables = numSyllables;
    }
}
