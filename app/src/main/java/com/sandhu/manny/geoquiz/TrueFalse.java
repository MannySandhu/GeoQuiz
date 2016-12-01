package com.sandhu.manny.geoquiz;

/**
 * Created by Manny S on 27/11/2016.
 */

public class TrueFalse {
    private int question;

    private boolean trueQuestion;

    public TrueFalse(int question, boolean trueQuestion){
        this.question = question;
        this.trueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public boolean isTrueQuestion() {
        return trueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        this.trueQuestion = trueQuestion;
    }
}
