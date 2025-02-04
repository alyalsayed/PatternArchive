package org.example.observer.Weather;

/**
 * Subject Interface
 */
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
