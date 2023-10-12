package org.example;

import java.util.function.Supplier;

public class Main {

    private int lastGeneratedId = 1000;  // Starting point for user IDs

    // Define a Supplier to generate unique user IDs
    private Supplier<Integer> userIdSupplier = () -> {
        lastGeneratedId++;
        return lastGeneratedId;
    };

    public int generateUserId() {
        return userIdSupplier.get();
    }

    public static void main(String[] args) {
        Main idGenerator = new Main();

        // Generate and print 5 unique user IDs
        for (int i = 0; i < 5; i++) {
            int userId = idGenerator.generateUserId();
            System.out.println("Generated User ID: " + userId);
        }
    }
}
