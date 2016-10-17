package com.mcieciak.springdemo;

/**
 * Created by Mateusz on 16.10.2016.
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach(){
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}