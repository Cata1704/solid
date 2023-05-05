package org.example;


import org.example.User.*;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = new InMemoryUserRepository();
        EmailService emailService = new EmailService() {
            @Override
            public void sendNotification(Object email, String accountCreated, String message) {

            }
        };
        NotificationService notificationService = new NotificationService() {
            @Override
            public void sendNotification(String message) {

            }
        };
        UserService userService = new UserService(userRepository, emailService, notificationService);

        User alice = new User(1, "Alice", "alice@example.com");


    }}