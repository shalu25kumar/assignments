package com.kb.beans;
 
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
 
public class User {
 
    private String name;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
}