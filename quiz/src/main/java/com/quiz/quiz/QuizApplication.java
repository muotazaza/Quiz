package com.quiz.quiz;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class QuizApplication {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("Beans.xml");

		QuizApp quiz =  context.getBean(QuizApp.class);

		quiz.view();

	}

}
