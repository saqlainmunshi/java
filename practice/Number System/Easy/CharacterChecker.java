public class CharacterChecker {
    public void checkCharacter(char c) {
        
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println(c + " is a vowel");
        } else {
            System.out.println(c + " is not a consonant");
        }
    }
}
