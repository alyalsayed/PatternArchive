package org.example.iterator;

public class Main {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        // Use our custom iterator to traverse the repository.
        Iterator<String> iterator = namesRepository.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
