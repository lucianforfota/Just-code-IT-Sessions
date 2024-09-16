package operatori;

import java.util.Scanner;

public class Ex13_Homework {
//13.Un angajat poate sa rezerve un meeting room doar daca este disponibil si daca nu a depasit numarul de rezervari per saptamana.
// Daca camera este o camera speciala (cu multe locuri), atunci poate fi rezervata doar daca echipa angajatului are mai mult de 10 membri.
//    Citeste de la tastatura:
//
//    boolean isRoomAvailable
//    boolean isQuotaExceeded
//    boolean isHighCapacityRoom
//    int teamSize
//    Foloseste variabila canBookRoom care sa retina daca angajatul poate sa rezerve sala, sau nu.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is the room available?");
        boolean isRoomAvailable = scanner.nextBoolean();
        System.out.println("Is the quota exceeded?");
        boolean isQuotaExceeded= scanner.nextBoolean();
        System.out.println("Is a high capacity room?");
        boolean isHighCapacityRoom= scanner.nextBoolean();
        System.out.println("Type the team size:");
        int teamSize = scanner.nextInt();

        boolean canBookRoom=isRoomAvailable && !isQuotaExceeded  && ((isHighCapacityRoom && teamSize >10) || !isHighCapacityRoom) ;
        System.out.println(canBookRoom);

    }
}
