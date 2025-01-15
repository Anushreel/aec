package com.example.demo;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class MyService {
    @PostConstruct
    public void init() {
        System.out.println("MyService bean initialized.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("MyService bean destroyed.");
    }

    public void performTask() {
        System.out.println("Task performed by MyService bean.");
    }
}
