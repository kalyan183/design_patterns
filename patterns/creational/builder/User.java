package org.examples.patterns.creational.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public static void main(String[] args) {

        final User user = User.builder()
                .firstName("kalyan")
                .lastName("stark")
                .age(21)
                .phone("9876543210")
                .address("Hyderabad")
                .build();

        final User userWithNames = User.builder()
                .firstName("kalyan")
                .lastName("stark")
                .build();

        final User anotherUser = User.builder()
                .age(21)
                .phone("9876543210")
                .address("Hyderabad")
                .build();

        System.out.println(user);
        System.out.println(userWithNames);
        System.out.println(anotherUser);
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
