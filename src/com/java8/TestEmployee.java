package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class TestEmployee {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("ABC",30,"Female","HR",3000));
        employees.add(new Employee("PQR",25,"Male","IT",15000));
        employees.add(new Employee("LMN",30,"Male","HR",20000));
        employees.add(new Employee("XYZ",28,"Female","IT",10000));


        // print all the department and department we want distinct

        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        // count of employee in each department

       Map<String,Long> employeeCount= employees.stream().
               collect(Collectors.groupingBy(Employee::getDepartment,
                       Collectors.counting()));

        System.out.println(employeeCount);

        // to find average age of female and male

        Map<String,Double>  avgAge= employees.stream().
                collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingInt(Employee::getAge)));

        System.out.println(avgAge);

        //to find the list of employees in age between 25-30

       employees.stream().filter(p ->p.getAge() >25 && p.getAge()< 30 ).forEach(System.out::println);


       employees.stream().filter(x->x.getGender()=="Male" && x.getDepartment()=="IT").forEach(System.out::println);

       //max salary
        Optional<Employee> emp = employees.stream()
                .collect(Collectors.maxBy(Comparator. comparingDouble(Employee::getSalary)));

        System.out.println(emp);

     // 2nd highest salary
        System.out.println("#####################################################");

        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .ifPresent(s-> System.out.println(s));

        System.out.println("#####################################################");

        Double collect = employees.stream().collect(Collectors.averagingInt(Employee::getAge));
        System.out.println(collect);



        System.out.println("#####################################################!!!!!");
        employees.stream().filter(s ->s.getName().startsWith("L")).forEach(System.out::println);

        System.out.println("#####################################################!!!!!122");
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);











    }




}
