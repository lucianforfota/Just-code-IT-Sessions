package operatori;

import java.util.Scanner;

public class Ex8_Homework {
   // 8.Cream o aplicatie pentru o biblioteca.
    // O carte poate fi imprumutata daca nu este deja imprumutata si daca clientul nu are mai mult de 3 carti imprumutate.
    // In plus, clientul trebuie sa nu aiba deloc datorii
    //Citeste de la tastatura:
    // Foloseste variabila canRentBook care sa retina daca clientul poate sa imprumute cartea, sau nu.



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Is book rented?");
        boolean isBookRented = scanner.nextBoolean();
        System.out.println("Number of rented books");
        int numberOfRentedBooks = scanner.nextInt();
        System.out.println("Has late fees?");
        boolean hasLateFees = scanner.nextBoolean();

    boolean canRentBook = !isBookRented && numberOfRentedBooks <=3 && !hasLateFees;
    System.out.println(canRentBook);

    }
}
