package com.mcieciak.springdemo;

/**
 * Created by Mateusz on 15.10.2016.
 */
public class BaseballCoach implements Coach{

//    prywatne pole dla dependency
    private FortuneService fortuneService;

//    konstruktor dla dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spent 30minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
