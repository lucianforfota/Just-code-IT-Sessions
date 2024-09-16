package operatori;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        //17. Un membru al bibliotecii poate împrumuta un roman doar dacă acesta este disponibil și dacă membrul nu a
        // depășit limita de cărți împrumutate pe lună. Dacă cartea este o ediție rară (cu valoare istorică semnificativă),
        // atunci poate fi împrumutată doar dacă cititorul are un istoric de cel puțin 10 cărți returnate la timp.
        //Citeste de la tastatura:
        //
        //isBookAvailable (boolean): Indică dacă cartea dorită este disponibilă pentru împrumut.
        //isBorrowLimitExceeded (boolean): Retine dacă membrul a depășit limita de cărți pe care le poate împrumuta pe lună.
        //isRareEdition (boolean): Specifică dacă cartea este o ediție rară cu valoare istorică semnificativă.
        //returnedBooksHistory (int): Numărul de cărți pe care membrul le-a returnat la timp în trecut.
        //Foloseste variabila canBorrowBook pentru a construi rezultatul.

        Scanner scanner = new Scanner(System.in);
        boolean isBookAvailable = scanner.nextBoolean();
        boolean isBorrowLimitExcedeed = scanner.nextBoolean();
        boolean isRareEdition = scanner.nextBoolean();
        int returnedBookHstiory = scanner.nextInt();



        boolean canBorrowBook = determineIfCanBorrowBook(isBookAvailable, isBorrowLimitExcedeed, isRareEdition, returnedBookHstiory);
        System.out.println(canBorrowBook);

    }

    public static boolean determineIfCanBorrowBook (boolean isBookAvailable, boolean isBorrowLimitExceed, boolean isRareEdition, int numberOfInTimeReturns ){
        //fac un algoritm bazat pe ce am in parametri mei ()

        return isBookAvailable && !isBorrowLimitExceed && (!isRareEdition || (isRareEdition && numberOfInTimeReturns>=10));


    }
}
