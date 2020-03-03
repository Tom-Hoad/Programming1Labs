/* Lab 4: Loops and ArrayLists */
package Y1S1.lab4;

import java.util.ArrayList;
import java.util.*;

public class UserGroup {
    // Declares the ArrayList of users.
    private ArrayList<User> users;

    // The UserGroup constructor method.
    public UserGroup() {
        // Instantiates the ArrayList of users.
        users = new ArrayList<User>();
    }

    // Returns the ArrayList of users.
    public ArrayList<User> getUsers() {
        return users;
    }

    // Adds 10 new users to the ArrayList.
    public void addSampleData() {
        User newUser1 = new User("ab1", "user", "Andy");
        User newUser2 = new User("cd2", "editor", "Charlie");
        User newUser3 = new User("ef3", "admin", "Eleanor");
        User newUser4 = new User("gh4", "user", "Gary");
        User newUser5 = new User("ij5", "editor", "Irene");
        User newUser6 = new User("kl6", "admin", "Kirk");
        User newUser7 = new User("mn7", "user", "Michael");
        User newUser8 = new User("op8", "editor", "Oscar");
        User newUser9 = new User("qr9", "admin", "Quentin");
        User newUser10 = new User("st10", "user", "Simon");

        users.add(newUser1);
        users.add(newUser2);
        users.add(newUser3);
        users.add(newUser4);
        users.add(newUser5);
        users.add(newUser6);
        users.add(newUser7);
        users.add(newUser8);
        users.add(newUser9);
        users.add(newUser10);
    }

    // Returns a specific user, takes their position as a parameter.
    public User getUser(int userPosition) {
        return users.get(userPosition);
    }

    // Prints the username and user type of all users.
    public void printUsernames() {
        // Uses a for each loop to print each users on a new line.
        for (User u : users) {
            System.out.println(u.getUsername() + " " + u.getUserType());
        }
    }

    // Removes the first user from the array list.
    public void removeFirstUser() {
        users.remove(0);
    }

    // Removes the last user from the array list.
    public void removeLastUser() {
        int lastUser = users.size() - 1;
        users.remove(lastUser);
    }

    // Removes a specific user, takes their username as a parameter.
    public void removeUser(String username) {
        // Creates an iterator ArrayList.
        Iterator<User> iterator = users.iterator();

        // While loops through the ArrayList and removes the user if the username matches.
        while (iterator.hasNext()) {
            if (iterator.next().getUsername().equals(username)) {
                iterator.remove();
                break;
            }
        }
    }

    // Returns the user an iterator to look through the ArrayList.
    public Iterator<User> getUserIterator() {
        return users.iterator();
    }

    // Allows users to be added to the ArrayList.
    public void addUser(User user) {
        users.add(user);
    }

    // Returns the last user in the array.
    public int lastUser() {
        return users.size() - 1;
    }
}
