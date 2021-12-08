package com.example.coachMaster;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public HelloSpringApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				// retrieve bean from spring container
				Coach theCoach = context.getBean("myCoach", Coach.class);
				// call methods on the bean
				System.out.println(theCoach.getDailyWorkout());
				
				// let's call our new method for fortunes
				System.out.println(theCoach.getDailyFortune());
				// close the context
				context.close();
	}

}