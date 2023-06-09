package com.theruzil.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
//            Pet pet = new Cat();
//            Pet pet = context.getBean("myPet", Pet.class);
            Person person = context.getBean("myPerson", Person.class);
            person.callYourPet();
        }
    }
}
