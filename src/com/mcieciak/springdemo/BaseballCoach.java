package com.mcieciak.springdemo;

/**
 * Created by Mateusz on 15.10.2016.
 */
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Spent 30minutes on batting practice";
    }
}
