package com.mcieciak.springdemo;

/**
 * Created by Mateusz on 16.10.2016.
 */
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
