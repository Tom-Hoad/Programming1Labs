/* Lab 9: Handling Files */
package lab9;

import java.io.*;
import java.util.ArrayList;

// The class FlashCardReader.
public class FlashCardReader {
    private BufferedReader reader;

    // The FlashCardReader constructor method. Instantiates the buffered reader if given a valid filename.
    public FlashCardReader(String filename) {
        try {
            reader = new BufferedReader(new FileReader(new File("src/lab9", filename)));
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file you want could not be found.");
        }
    }

    // A method to read the next line of the file.
    public String getLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("Error: The file could not read the next line.");
            return null;
        }
    }

    // Finds if the file can be read.
    public boolean fileIsReady() {
        try {
            return reader.ready();
        } catch (IOException | NullPointerException e) {
            System.out.println("Error: The file is not ready.");
            return false;
        }
    }

    // Gets the ArrayList of flashcards.
    public ArrayList<FlashCard> getFlashCards() {
        ArrayList<FlashCard> flashCards = new ArrayList<>();

        while (fileIsReady()) {
            String[] split = getLine().split(":");
            flashCards.add(new FlashCard(split[0], split[1]));
        }
        return flashCards;
    }
}
