package com.DesignPattern.Prototype;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Creating object using prototype design");


        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("192.168.1.10");
        networkConnection.loadImportantData();


        System.out.println(networkConnection);


        // we want new object

        try {
           NetworkConnection connection= (NetworkConnection) networkConnection.clone();
            System.out.println(connection);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
