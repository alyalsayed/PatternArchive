package org.example.observer.Messages;

class MessageSubscriber implements Observer {
    private String name;

    public MessageSubscriber(String name) {
        this.name = name;
    }

    // This method is called by the Subject to notify the observer of changes
    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}
