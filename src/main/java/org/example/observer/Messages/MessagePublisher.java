package org.example.observer.Messages;

import java.util.ArrayList;
import java.util.List;

class MessagePublisher implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // Notifies all registered observers about the new message
    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Example method to change state and notify observers
    public void postMessage(String message) {
        System.out.println("MessagePublisher: Posting message - " + message);
        notifyObservers(message);
    }
}
