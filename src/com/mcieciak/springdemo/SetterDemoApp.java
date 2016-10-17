package com.mcieciak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mateusz on 16.10.2016.
 */
public class SetterDemoApp {

    public static void main(String[] args) {

//        wczytanie pliku konfiguracyjnego Springa
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext
                ("applicationContext.xml");

//        wczytanie beana
        CricketCoach theCoach=context.getBean("myCricketCoach", CricketCoach.class);

//        wywolanie metody na beanie
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

//        zamkniecie context
        context.close();



    }
}
