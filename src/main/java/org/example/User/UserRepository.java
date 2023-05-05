package org.example.User;

public interface UserRepository {

    User getUserById(int id);
    void saveUser(User user);
    void deleteUser(User user);
}
