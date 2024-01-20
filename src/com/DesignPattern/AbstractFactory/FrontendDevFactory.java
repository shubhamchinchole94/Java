package com.DesignPattern.AbstractFactory;

public class FrontendDevFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new FrontendDeveloper();
    }
}
