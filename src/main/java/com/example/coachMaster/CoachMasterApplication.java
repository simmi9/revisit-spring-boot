package com.example.coachMaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoachMasterApplication {

	public static void main(String[] args) {
		// create the object
				Coach theCoach = new TrackCoach();
				System.out.println(theCoach.getDailyWorkout());  
		SpringApplication.run(CoachMasterApplication.class, args);
	}

}
