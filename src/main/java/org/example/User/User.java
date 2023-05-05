package org.example.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class User {
    public User(int i, String alice, String mail) {
    }

    public int getAge() {
        return 0;
    }

    public int getEmail() {
        return 0;
    }

    public String getName() {
        return null;
    }
}
