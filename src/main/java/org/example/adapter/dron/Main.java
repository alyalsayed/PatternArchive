package org.example.adapter.dron;

public class Main {
    public static void main(String[] args) {
        // Create a drone
        Drone myDrone = new StandardDrone();

        // Wrap the drone with the adapter to make it behave like a duck
        Duck droneAsDuck = new DroneAdapter(myDrone);

        // Use the duck interface
        System.out.println("The drone adapter acting as a duck:");
        droneAsDuck.quack();
        droneAsDuck.fly();
    }
}