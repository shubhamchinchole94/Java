package com.DesignPattern.Factory;

public class FrontendDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting frontend developer salary :");
        return 50000;
    }
}
