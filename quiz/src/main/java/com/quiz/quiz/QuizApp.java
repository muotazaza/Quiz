package com.quiz.quiz;

import java.util.List;

public class QuizApp {
    private List<Questions>questions ;

    public QuizApp() {
    }

    public QuizApp(List<Questions> questions) {
        this.questions = questions;
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }

    public void view(){
        for (Questions questions1:questions){
            System.out.println(questions1.getQuestionsText()  );
            for (Answer answer:questions1.getAnswers()){
                System.out.println(answer);
            }
        }
    }

}
