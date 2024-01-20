package com.DesignPattern.Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DeveloperClient {

    public static void main(String[] args) throws IOException {

        EmployeeFactory employeeFactory= new EmployeeFactory();
        System.out.print("Enter type of Employee: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String developerType = bufferedReader.readLine();

        Employee employee = employeeFactory.getEmployee(developerType);

        System.out.println(developerType);

        System.out.println(employee.salary());


    }
}
