/* Lab 4: Loops and ArrayLists */
package lab4;

public class User {
    // Creating the member variables of a user.
    private String username;
    private String userType;
    private String name;

    // The User constructor method. Takes a username, user type and name as parameters.
    public User(String username, String userType, String name) {
        this.username = username;
        this.userType = userType;
        this.name = name;
    }

    // The username getter method.
    public String getUsername() {
        return username;
    }

    // The user type getter method.
    public String getUserType() {
        return userType;
    }

    // The name getter method.
    public String getName() {
        return name;
    }

    // The user type setter method.
    public void setUserType(String userType) {
        this.userType = userType;
    }
}
