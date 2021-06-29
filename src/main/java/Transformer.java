import java.util.ArrayList;
import java.util.List;

public class Transformer {
    //    małe - tu jest lista wszystkich małych liter przesłanych przez usera z zachowaniem kolejności
    List<Character> smallLetters = new ArrayList<>();
    List<Character> capitalLetters = new ArrayList<>();


    public TransformedString transform(String userInput) {
        List smallLetters = pickSmallLetters(userInput);
        List capitalLetters = pickCapitalLetters(userInput);
        int userInputLen = getStringLengthWithoutSpecialCharacters();
        return new TransformedString(smallLetters, capitalLetters, userInputLen);
    }

    private List<Character> pickSmallLetters(String userInput) {

        for (int i = 0; i < userInput.length(); i++) {

            char character = userInput.charAt(i);
            int ascii = (int) character;
            if ((ascii >= 97) && (ascii <= 122)) {
                smallLetters.add(character);
            }
        }
        return smallLetters;

    }

    private List<Character> pickCapitalLetters(String userInput) {

        for (int i = 0; i < userInput.length(); i++) {

            char character = userInput.charAt(i);
            int ascii = (int) character;
            if ((ascii >= 65) && (ascii <= 90)) {
                capitalLetters.add(character);
            }
        }
        return capitalLetters;
    }

    private int getStringLengthWithoutSpecialCharacters() {
        return smallLetters.size() + capitalLetters.size();
    }
}
