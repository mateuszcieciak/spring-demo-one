package com.mcieciak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mateusz on 17.10.2016.
 */
public class BeanScopeDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

//        Test zachowania singleton scope - domyslny zasieg
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

//        Sprawdzenie czy to ten sam bean (obiekt w pamieci)
        boolean result=(theCoach==alphaCoach);
        System.out.println("Czy to ten sam obiekt? "+result);
        System.out.println("Miejsce w pamieci theCoach:" +theCoach);
        System.out.println("Miejsce w pamieci alphaCoach:" +alphaCoach);

        context.close();


    }
}
