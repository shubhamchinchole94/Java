package com.DesignPattern.Singleton;

public class Connection {

     // create field private
     private  static Connection connection = null;
    // constructor should be private
    private Connection(){

    }

    // method should be static
    // this is Lazy initialization
    public static Connection getConnection(){

        if (connection == null){

            // we use synchronized block for thread safety
            // only one thread can create an object at a time
            synchronized (Connection.class){
                if(connection == null){
                    connection = new Connection();
                }
            }
        }
        return connection;
    }
}
