/* Lab 3: Methods, Object Interactions and Testing */
package Y1S1.lab3;

public class CardLock {
    SmartCard lastCard;         // Declaration of instance variables.
    boolean unlocked;
    boolean studentAccess;
    
    public void swipeCard(SmartCard lastCard) {         // The swipecard method to check if the door will unlock.
        this.unlocked = false;          // Automatically locks whenever a new card is presented.
        
        this.lastCard = lastCard;
        
        if (lastCard.isStaff() == true || this.studentAccess == true) {         // Determines if the door will unlock for the type of card given.
            this.unlocked = true;
        }
    }

    public SmartCard getLastCardSeen() {        // The lastcard object getter method.
        return lastCard;
    }
    
    public boolean isUnlocked() {       // The unlocked variable getter method.
        return unlocked;
    }
    
    public void toggleStudentAccess() {
        this.studentAccess = !this.studentAccess;
    }
}