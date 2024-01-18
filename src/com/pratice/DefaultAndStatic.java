package com.pratice;

public class DefaultAndStatic implements DefaultInterface  {

    public static void main(String[] args) {

        DefaultAndStatic defaultAndStatic = new DefaultAndStatic();
          defaultAndStatic.show();
          DefaultInterface.display();
    }
}


interface DefaultInterface{

    //static method
    static void display() {
        System.out.println("static Method Executed");
    }

    // default method
    default void show()
    {

        System.out.println("Default Method Executed");
    }

}
