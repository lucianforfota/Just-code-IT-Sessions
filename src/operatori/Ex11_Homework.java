package operatori;

import java.util.Scanner;

public class Ex11_Homework {
//   11.Un jucator poate avansa la nivelul urmator doar daca are mai mult de 1000 de puncte sau daca are o cheie de aur, si in plus, nu este sub atac.
//   Mai mult, jocul trebuie sa nu fie pus pe pauza si serverul trebuie sa ruleze.
//    Citeste de la tastatura:
//
//    int playerPoints
//    boolean hasGoldenKey
//    boolean isUnderAttack
//    boolean isGamePaused
//    boolean isServerRunning
//    Foloseste variabila canAdvanceLevel care sa retina daca jucatorul poate sa avanseze, sau nu.



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the player's points:");
        int playerPoints = scanner.nextInt();
        System.out.println("Has golden key?");
        boolean hasGoldenKey = scanner.nextBoolean();
        System.out.println("Is the player under attack?");
        boolean isUnderAttack = scanner.nextBoolean();
        System.out.println("Is the game paused?");
        boolean isGamePaused = scanner.nextBoolean();
        System.out.println("Does the server run?");
        boolean isServerRunning = scanner.nextBoolean();

        boolean canAdvanceLevel=  (playerPoints >1000 || hasGoldenKey) && !isUnderAttack && !isGamePaused && isServerRunning;
        System.out.println(canAdvanceLevel);



    }
}
