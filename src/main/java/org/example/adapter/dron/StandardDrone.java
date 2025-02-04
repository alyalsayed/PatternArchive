package org.example.adapter.dron;

public class StandardDrone implements Drone {
    @Override
    public void beep() {
        System.out.println("Drone: Beep beep!");
    }

    @Override
    public void spinRotors() {
        System.out.println("Drone: Rotors are spinning.");
    }

    @Override
    public void takeOff() {
        System.out.println("Drone: Taking off!");
    }
}

