package com.DesignPattern.Builder;

public class Main {
    public static void main(String[] args) {


        User user = new User.UserBuilder()
                .setUserId("71119")
                .setUserName("Shubham")
                .setEmailId("shubham@mail.com")
                .build();


        System.out.println(user);


       User user1= User.UserBuilder.builder()
                .setEmailId("dev@mail.in")
                .setUserName("Dev")
                .build();

        System.out.println(user1);
    }
}
