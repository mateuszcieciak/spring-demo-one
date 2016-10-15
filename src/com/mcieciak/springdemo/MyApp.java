package com.mcieciak.springdemo;

/**
 * Created by Mateusz on 15.10.2016.
 */
public class MyApp {

    public static void main(String[] args) {

        Coach theCoach=new TrackCoach();

        System.out.println(theCoach.getDailyWorkout());
    }
}
