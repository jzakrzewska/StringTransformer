public class Main {
    public static void main(String[] args) {
        System.out.println("Cześć dupo");


        String userInput = "dupa@@##$EBGKRPLD:XL<M%%&^&*P";

        Transformer transformedInput = new Transformer();
        TransformedString transformedString = transformedInput.transform(userInput);
        System.out.println(transformedString);

    }
}
