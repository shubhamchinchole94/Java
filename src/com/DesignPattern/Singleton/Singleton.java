package com.DesignPattern.Singleton;

public class Singleton {

    public static void main(String[] args) {

        // Lazy way
        Connection con1 = Connection.getConnection();
        System.out.println(con1.hashCode());
        Connection con2 = Connection.getConnection();
        System.out.println(con2.hashCode());


        // Eagar way
        System.out.println(ConnectionEagar.getConnectionEagar().hashCode());
        System.out.println(ConnectionEagar.getConnectionEagar().hashCode());


    }
}
