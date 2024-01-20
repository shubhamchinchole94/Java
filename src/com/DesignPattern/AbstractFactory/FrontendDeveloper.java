package com.DesignPattern.AbstractFactory;

public class FrontendDeveloper implements Employee{
    @Override
    public int salary() {
        return 80000;
    }

    @Override
    public String name() {
        System.out.println("I am a frontend developer");
        return "Frontend Developer";
    }
}
