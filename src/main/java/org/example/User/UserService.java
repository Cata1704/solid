package org.example.User;

public class UserService {

    private UserRepository userRepository;
    private EmailService emailService;
    private NotificationService notificationService;

    public UserService(UserRepository userRepository, EmailService emailService, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
        this.notificationService = notificationService;
}
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }
    public void saveUser(User user) {
        userRepository.saveUser(user);
        emailService.sendNotification(user.getEmail(), "Account created", "Your account has been created successfully.");
        notificationService.sendNotification("New user created: " + user.getName());
    }

    public void deleteUser(User user) {
        userRepository.deleteUser(user);
        notificationService.sendNotification("User deleted: " + user.getName());
    }
}
