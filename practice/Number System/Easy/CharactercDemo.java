import java.util.Scanner;

public class CharactercDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);

        CharacterChecker checker = new CharacterChecker();
        checker.checkCharacter(c);
    }
}
