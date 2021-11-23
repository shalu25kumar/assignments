package com.kb.beans;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
public class BeansLifeCycle {
 
    public static void main(String[] args) {
 
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");  
       
        //Load PersonService object
        PersonService personService = (PersonService)applicationContext.getBean("personService");
        System.out.println("Name : "+personService.getPerson().getName());
       
        //Load UserService object
        UserService userService = (UserService)applicationContext.getBean("userService");
        System.out.println("Name : "+userService.getUser().getName());
       
        applicationContext.registerShutdownHook();
       
    }
 
}