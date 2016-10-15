package com.mcieciak.springdemo;

/**
 * Created by Mateusz on 15.10.2016.
 */
public class MyApp {

    public static void main(String[] args) {

        BaseballCoach theCoach=new BaseballCoach();

        System.out.println(theCoach.getDailyWorkout());
    }
}
