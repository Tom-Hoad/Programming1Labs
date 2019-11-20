/* Lab 4: Loops and ArrayLists */
package lab4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Toolbox myToolbox = new Toolbox();

        // Reads the user input, the times table factor.
        int timesFactor = myToolbox.readIntegerFromCmd();

        // The for loop to print the first 20 values of the times table.
        for (int i = 1; i <= 20; i++) {
            System.out.print(i * timesFactor);

            // Formats the row.
            if (i < 20) {
                System.out.print(", ");
            }
        }

        System.out.println("");

        // The code to sum to 500.
        int sum = 1;
        int count = 1;

        // A wile loop to add up the consecutive numbers to a sum.
        while (sum < 500) {
            count++;
            sum += count;
        }

        // Outputs the result, expected to be 32.
        System.out.println(count);

        // Creates a new user group. Populates the user group, then prints their username's.
        UserGroup mainGroup = new UserGroup();
        mainGroup.addSampleData();
        System.out.println("*****************************************");
        System.out.println("The Users:");
        System.out.println("*****************************************");
        mainGroup.printUsernames();

        // Creates a new user group of administrators, with an iterator of all users.
        UserGroup administrators = new UserGroup();
        Iterator<User> iterator = mainGroup.getUserIterator();

        // Adds any admin user to the administrators group.
        while (iterator.hasNext()) {
            User next = iterator.next();

            if (next.getUserType().equals("admin")) {
                administrators.addUser(next);
            }
        }

        // Prints the admins and then changes the last admin to a normal user.
        System.out.println("*****************************************");
        System.out.println("The Administrators:");
        System.out.println("*****************************************");
        administrators.printUsernames();
        User lastAdmin = administrators.getUser(administrators.lastUser());
        lastAdmin.setUserType("user");

        /* The problem now is that there is a regular user in the admin group. To fix this, perhaps a new method could
        be created to check the admin group if all of the users in there are actually an admin. However, the change has
        occurred in both groups, meaning that its a consistent change.*/
        System.out.println("*****************************************");
        System.out.println("The Users:");
        System.out.println("*****************************************");
        mainGroup.printUsernames();
        System.out.println("*****************************************");
        System.out.println("The Administrators:");
        System.out.println("*****************************************");
        administrators.printUsernames();
    }
}
