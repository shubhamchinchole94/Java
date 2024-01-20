package com.DesignPattern.AbstractFactory;

public class BackendDevFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new BackendDeveloper();
    }
}
