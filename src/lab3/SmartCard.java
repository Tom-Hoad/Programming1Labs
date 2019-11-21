/* Lab 3: Methods, Object Interactions and Testing */
package lab3;

public class SmartCard {
    private String owner;		// Declaration of instance variables.
    private boolean staff;
    
    public SmartCard(String owner) {		// The constructor method to create a smartcard.
        this.owner = owner;
        this.staff = false;
    }
    
    public String getOwner() {		// The owner variable getter method.
        return owner;
    }
    
    public boolean isStaff() {		// The staff variable getter method.
        return staff;
    }
    
    public void setStaff(boolean staff) {	// The staff variable setter method.
        this.staff = staff;
    }
}