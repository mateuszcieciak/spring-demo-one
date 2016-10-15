package com.mcieciak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mateusz on 15.10.2016.
 */
public class SpringHelloApp {

    public static void main(String[] args) {

//        wczytanie pliku konfiguracyjnego Springa
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext.xml");

//        wczytanie beana
        Coach theCoach =context.getBean("myCoach", Coach.class);

//        wywolanie metody na beanie
        System.out.println(theCoach.getDailyWorkout());

//        zamkniecie context
        context.close();

    }
}
