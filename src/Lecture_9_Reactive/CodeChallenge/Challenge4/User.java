package Lecture_9_Reactive.CodeChallenge.Challenge4;

public class User {
    public final String firstName;
    public final String lastName;
    public final String getUserName;

    public User(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.getUserName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return getUserName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", getUserName='" + getUserName + '\'' +
                '}';
    }
}
