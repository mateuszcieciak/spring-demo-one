package com.mcieciak.springdemo;

/**
 * Created by Mateusz on 15.10.2016.
 */
public class TrackCoach implements Coach {

//    prywatne pole dla dependency
    private FortuneService fortuneService;

    public TrackCoach() {
    }

//    konstruktor dla dependency injection
    public TrackCoach(FortuneService theFortuneService) {
        fortuneService=theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: "+fortuneService.getFortune();
    }
}
