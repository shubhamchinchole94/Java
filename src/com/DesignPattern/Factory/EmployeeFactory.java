package com.DesignPattern.Factory;

public class EmployeeFactory {

    public   Employee getEmployee(String empType){

        if(empType.trim().equalsIgnoreCase("Frontend Developer")){
            return new FrontendDeveloper();

        } else if (empType.trim().equalsIgnoreCase("Backend Developer")) {
            return new BackendDeveloper();
        }else {
            return null;
        }
    }
}
