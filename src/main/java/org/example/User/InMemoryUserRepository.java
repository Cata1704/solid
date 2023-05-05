package org.example.User;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor

public class InMemoryUserRepository implements UserRepository {


    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }
}
