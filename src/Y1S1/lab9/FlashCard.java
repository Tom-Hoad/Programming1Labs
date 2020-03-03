/* Lab 9: Handling Files */
package Y1S1.lab9;

// The class FlashCard.
public class FlashCard {
    private String question;
    private String answer;

    // The FlashCard constructor method. Takes the question and answer.
    public FlashCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // Gets the question on the flashcard.
    public String getQuestion() {
        return question;
    }

    // Gets the answer on the flashcard.
    public String getAnswer() {
        return answer;
    }
}
