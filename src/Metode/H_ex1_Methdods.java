package Metode;

import java.util.Scanner;

public class H_ex1_Methdods {
    public static void main(String[] args) {


// 1. Creeaza o metoda numita hasEqualSum(), care primeste 3 parametri reprezentand numere intregi.
// Metoda va returna true daca suma primilor 2 parametri este egala cu cel de-al 3-lea. De exemplu:

// apelul de metoda cu parametri 1,1,1, adica hasEqualSum(1, 1, 1) va returna  false pentru ca 1 + 1 (suma primilor 2 parametri) nu este egal cu 1 (al 3-lea parametru)
// apelul de metoda cu parametri 1,1,2, adica hasEqualSum(1, 1, 1) va returna  true pentru ca 1 + 1 (suma primilor 2 parametri) este egal cu 2 (al 3-lea parametru)


        Scanner scanner = new Scanner(System.in);
        System.out.println("tasteaza numarul 1");
        int number1 = scanner.nextInt();
        System.out.println("tasteaza numarul 2");
        int number2 = scanner.nextInt();
        System.out.println("tasteaza numarul 3");
        int number3 = scanner.nextInt();

        boolean hasEqualSum=hasEquaalSum(number1,number2,number3);
        System.out.println(hasEqualSum);

    }

    public static boolean hasEquaalSum(int number1,int number2,int number3){
        boolean hasEqualSum= number1+number2==number3;
        return hasEqualSum;
    }
}
