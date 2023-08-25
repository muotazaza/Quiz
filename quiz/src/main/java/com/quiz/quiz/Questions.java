package com.quiz.quiz;

import java.util.List;

public class Questions {
    private String questionsText ;
    private List<Answer>  answers;

    public Questions() {
    }

    public String getQuestionsText() {
        return questionsText;
    }

    public void setQuestionsText(String questionsText) {
        this.questionsText = questionsText;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
