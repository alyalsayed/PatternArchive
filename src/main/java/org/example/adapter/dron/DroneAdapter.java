package org.example.adapter.dron;

public class DroneAdapter implements Duck {
    private Drone drone;

    public DroneAdapter(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void quack() {
        // The drone doesn't quack. Instead, we simulate a quack with a beep.
        drone.beep();
    }

    @Override
    public void fly() {
        // The drone flies by spinning rotors and taking off.
        drone.spinRotors();
        drone.takeOff();
    }
}

