import java.util.List;

public class TransformedString {

    List<Character> smallLetters;
    List<Character> capitalLetters;
    int stringLengthWithoutSpecialCharacters;


    public TransformedString(List<Character> smallLetters, List<Character> capitalLetters, int stringLengthWithoutSpecialCharacters) {
        this.smallLetters = smallLetters;
        this.capitalLetters = capitalLetters;
        this.stringLengthWithoutSpecialCharacters = stringLengthWithoutSpecialCharacters;
    }


    @Override
    public String toString() {
        return "TransformedString{" +
                "smallLetters=" + smallLetters +
                ", capitalLetters=" + capitalLetters +
                ", stringLengthWithoutSpecialCharacters=" + stringLengthWithoutSpecialCharacters +
                '}';
    }
}
