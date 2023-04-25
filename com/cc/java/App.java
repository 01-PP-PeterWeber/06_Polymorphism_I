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

    // Variante 1 . Overloading - überladene Methoden //
    private static void pollObject(Queen obj) {
        output(obj.doYourJob());
        output(obj.fly());
   }

    private static void pollObject(Worker obj) {
        output(obj.doYourJob());
        output(obj.fly());
}

    private static void pollObject(Drone obj) {
        output(obj.doYourJob());
        output(obj.fly());
}


   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

