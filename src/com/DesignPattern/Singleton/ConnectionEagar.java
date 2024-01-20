package com.DesignPattern.Singleton;

public class ConnectionEagar {

    // Eagar way of creating singleton object
    private static  ConnectionEagar connectionEagar = new ConnectionEagar();
    public static ConnectionEagar getConnectionEagar(){

        return connectionEagar;
    }


}
