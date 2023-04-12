package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       employee add = (employee) context.getBean("emp");
       employee add1 = (employee) context.getBean("Emp");

       System.out.println(add);
       System.out.println(add1);
    }
}
