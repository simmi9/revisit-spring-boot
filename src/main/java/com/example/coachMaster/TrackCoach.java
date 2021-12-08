package com.example.coachMaster;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getDailyWorkout() {
		return "trackcoach";
	}
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
}
