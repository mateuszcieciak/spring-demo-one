package com.mcieciak.springdemo;

/**
 * Created by Mateusz on 15.10.2016.
 */
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
