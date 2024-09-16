package operatori;

import java.util.Scanner;

public class Ex5 {
    //5. [LIVE] Determina daca un utilizator se poate loga in aplicatie.
    //Ai la dispozitie variabilele username si password deja declarate si initializate.
    //
    //Citeste de la tastatura inputUsername si inputPassword (adica username-ul si parola pe care ti le da utilizatorul).
    //
    //Apoi, determina daca ce a introdus utilizatorul este acelasi lucru cu username-ul si parola existente.
    //
    //Foloseste variabila isUserLoggedIn care sa retina daca utilizatorul s-a logat, sau nu, in aplicatie

    public static void main(String[] args) {
        String username = "user";
        String password = "pass";
        Scanner scanner = new Scanner(System.in);
        System.out.println("ïntrodu userul");
        String inputUsername = scanner.nextLine();
        System.out.println("ïntrodu parola");
        String inputPassword = scanner.nextLine();


        //username-ul existent este egal cu esernam-eul primit si parola existenta este egala cu parola primita
        boolean isLoggedIn = username.equals(inputUsername) && password.equals(inputPassword);
        System.out.println(isLoggedIn);


    }
}
