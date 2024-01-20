package com.DesignPattern.Factory;


 public class BackendDeveloper implements Employee
{
    @Override
    public int salary() {
        System.out.println("Getting backend developer salary:");
        return 80000;
    }
}
