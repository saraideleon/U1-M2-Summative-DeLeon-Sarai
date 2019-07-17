import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to: " + "\n" + "1. Run" + "\n" + "2. Attack" + "\n" + "or 3. Heal" + "\n" + "4. Decrease Health" + "\n" + "or 5. Increase Stamina" + "\n" + "4. Decrease Stamina?");
        int character = scanner.nextInt();
    }
}
