package org.example.User;

public class AgeFilterCriteria implements UserFilterCriteria {

    private int age;

    public AgeFilterCriteria(int age) {
        this.age = age;
    }

    public boolean matches(User user) {
        return user.getAge() == age;
    }


}
