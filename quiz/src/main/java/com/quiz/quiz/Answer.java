package com.quiz.quiz;

public class Answer {
    public String Id;
    public String answerString;
    public  String SubmittedBy;

    public Answer() {
    }

    public void setId(String id) {
        Id = id;
    }

    public void setAnswerString(String answerString) {
        this.answerString = answerString;
    }

    public void setSubmittedBy(String submittedBy) {
        SubmittedBy = submittedBy;
    }

    public String getId() {
        return Id;
    }

    public String getAnswerString() {
        return answerString;
    }

    public String getSubmittedBy() {
        return SubmittedBy;
    }

    @Override
    public String toString() {
        return "(by" + SubmittedBy + ") " + answerString;
    }
}

