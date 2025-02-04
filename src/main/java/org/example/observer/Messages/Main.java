package org.example.observer.Messages;

public class Main {
    public static void main(String[] args) {
        // Create the subject (publisher)
        MessagePublisher publisher = new MessagePublisher();

        // Create observers (subscribers)
        Observer subscriber1 = new MessageSubscriber("Subscriber 1");
        Observer subscriber2 = new MessageSubscriber("Subscriber 2");
        Observer subscriber3 = new MessageSubscriber("Subscriber 3");

        // Attach observers to the publisher
        publisher.attach(subscriber1);
        publisher.attach(subscriber2);
        publisher.attach(subscriber3);

        // Post a message; all subscribers will be notified
        publisher.postMessage("Hello Observers!");

        // Detach one subscriber and post another message
        publisher.detach(subscriber2);
        publisher.postMessage("Another message!");
    }
}
