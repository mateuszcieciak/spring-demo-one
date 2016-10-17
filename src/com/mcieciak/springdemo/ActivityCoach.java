package com.mcieciak.springdemo;

/**
 * Created by Mateusz on 17.10.2016.
 */
public class ActivityCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    public ActivityCoach(){
        System.out.println("ActivityCoach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("ActivityCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("ActivityCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("ActivityCoach: inside setter method - setTeam");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "dailyWorkout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
