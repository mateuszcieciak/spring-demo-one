package com.mcieciak.springdemo;

import java.util.Random;

/**
 * Created by Mateusz on 17.10.2016.
 */
public class ActivityFortuneService implements FortuneService {

    private String[] array = {"lucky", "happy", "sad"};

    Random rnd = new Random();
    int index = rnd.nextInt(array.length);

    @Override
    public String getFortune() {
        return array[index];
    }
}
