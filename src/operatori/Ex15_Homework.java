package operatori;

import java.util.Scanner;

public class Ex15_Homework {
//15.O companie va aproba cererea de telefoane mobile pentru angajatul său dacă angajatul ocupă o poziție de nivel mediu sau superior (isMidOrSeniorLevel) și dacă a lucrat pentru
// companie mai mult de 2 ani. Dacă angajatul solicită un model de telefon de ultimă generație (costând peste 800 euro, phoneCost > 800), atunci acesta trebuie să aibă și evaluări pozitive
// de performanță.
//    Citeste de la tastatura:
//    int yearsWithCompany;
//    boolean isMidOrSeniorLevel;
//    double phoneCost;
//    boolean hasPositiveReviews;
//    Foloseste variabila isPhoneRequestApproved care sa retina daca cererea este aprobata, sau nu.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type number of years in company");
        int yearsWithCompany = scanner.nextInt();
        System.out.println("Is mid or senior level?");
        boolean isMidOrSeniorLevel = scanner.nextBoolean();
        System.out.println("Type the phone cost:");
        double phoneCost = scanner.nextDouble();
        System.out.println("Has positive reviews?");
        boolean hasPositiveReviews = scanner.nextBoolean();

        boolean isPhoneRequestApproved= (isMidOrSeniorLevel && yearsWithCompany>2) && ((phoneCost>800 && hasPositiveReviews)|| phoneCost<=800);
                System.out.println(isPhoneRequestApproved);

    }
}
