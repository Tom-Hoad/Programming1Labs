/* Lab 9: Handling Files */
package lab9;

import java.io.File;
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
            System.out.println("Q: " + flashCard.getQuestion());

            // Reads the answer and checks it.
            String userAnswer = toolbox.readStringFromCmd();
            userAnswers.add(userAnswer);
            if (userAnswer.equals(flashCard.getAnswer())) {
                System.out.println("Correct!");
                userResults.add("right");
                score++;
            } else {
                System.out.println("Wrong!");
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

    // Gets the percentage score.
    public int getPercentage() {
        return (score / flashCards.size()) * 100;
    }

    // The main method to run the game.
    public static void main(String[] args) {
        Quiz quiz = new Quiz("Questions.txt");
    }

    // Saves the quiz results in a separate file.
    public void save() {
        // Creates the results file. ("H:\\ProgrammingLabs\\src\\lab9\\save.txt")
        File resultsFile = new File("D:\\Documents\\IdeaProjects\\Programming1Labs\\src\\lab9\\save.txt");
        try {
            resultsFile.createNewFile();
            PrintStream fileWriter = new PrintStream(resultsFile);

            // Prints results of the questions.
            for (int i = 0; i < flashCards.size(); i++) {
                fileWriter.println(flashCards.get(i).getQuestion() + "," + userAnswers.get(i) + "," + userResults.get(i));
            }
            fileWriter.println(getScore() + "," + flashCards.size() + "," + getPercentage());
        } catch (IOException e) {
            System.out.println("Error: The file could not be created.");
        }
    }
}
