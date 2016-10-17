package com.mcieciak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mateusz on 17.10.2016.
 */
public class ActivityApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext.xml");

        ActivityCoach theCoach=context.getBean("myActivityCoach", ActivityCoach.class);

        //        wywolanie metody na beanie
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
//        zamkniecie context
        context.close();
    }
}
