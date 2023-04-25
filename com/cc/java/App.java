package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        pollObject(queen);
        pollObject(worker);
        pollObject(drone);
        
    }

    // Variante 2 . Polymorphie //
    private static void pollObject(HoneyBee obj) {
        output(obj.doYourJob());
        output(obj.fly());
    }

   
    private static void output(String outputStr) {
        System.out.println(outputStr);
}



}

