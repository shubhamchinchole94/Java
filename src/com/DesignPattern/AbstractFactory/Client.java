package com.DesignPattern.AbstractFactory;

public class Client {

    public static void main(String[] args) {


       Employee employee= EmployeeFactory.getEmployee(new BackendDevFactory());

        System.out.println(employee.salary()+" " +employee.name());

        Employee employee1= EmployeeFactory.getEmployee(new FrontendDevFactory());

        System.out.println();

        System.out.println(employee1.salary()+" " +employee1.name());



    }


}
