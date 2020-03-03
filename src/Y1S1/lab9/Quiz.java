/* Lab 9: Handling Files */
package Y1S1.lab9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

// The class Quiz.
public class Quiz {
    private FlashCardReader flashCardReader;
    private ArrayList<FlashCard> flashCards;
    private Toolbox toolbox = new Toolbox();
    private ArrayList<String> userAnswers;
    private ArrayList<String> userResults;
    private int score;

    // The Quiz constructor method.
    public Quiz(String filename) {
        this.flashCardReader = new FlashCardReader(filename);
        flashCards = flashCardReader.getFlashCards();
        userAnswers = new ArrayList<>();
        userResults = new ArrayList<>();
        score = 0;
        play();
    }

    // Plays the game.
    public void play() {
        // Finds out if the user wants to save the results.
        System.out.println("Do you want to save the results?");
        String saveResults = toolbox.readStringFromCmd();

        for (FlashCard flashCard : flashCards) {
            // Displays the questions.
            System.out.println(flashCard.getQuestion());

            // Reads the answer and checks it.
            String userAnswer = toolbox.readStringFromCmd();
            userAnswers.add(userAnswer);
            if (userAnswer.equals(flashCard.getAnswer())) {
                System.out.println("right");
                userResults.add("right");
                score++;
            } else {
                System.out.println("wrong");
                System.out.println("The correct answer is: " + flashCard.getAnswer());
                userResults.add("wrong");
            }
        }

        // Saves the results.
        if (saveResults.equals("Y")) {
            save();
        }
    }

    // Gets the score.
    public int getScore() {
        return score;
    }

    // Gets the number of flashcards.
    public int getSize() { return flashCards.size(); }

    // Gets the percentage score.
    public double getPercentage() {
        double percentage = (double) getScore() / getSize();
        return percentage * 100;
    }

    // Saves the quiz results in a separate file.
    public void save() {
        // Creates the results file.
        try {
            PrintStream fileWriter = new PrintStream(new FileOutputStream("save.txt"));

            // Prints results of the questions.
            for (int i = 0; i < flashCards.size(); i++) {
                fileWriter.println(flashCards.get(i).getQuestion() + "," + userAnswers.get(i) + "," + userResults.get(i));
            }
            fileWriter.println(getScore() + "," + getSize() + "," + getPercentage());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error: The file could not be created.");
        }
    }

    // The main method to run the game.
    public static void main(String[] args) {
        Quiz quiz = new Quiz("Questions.txt");
    }
}
