package Metode;

import java.util.Scanner;

public class MethodsEx1Explicatii {

    //1. Creeaza o metoda numita hasEqualSum(), care primeste 3 parametri reprezentand numere intregi.
    //Metoda va returna true daca suma primilor 2 parametri este egala cu cel de-al 3-lea. De exemplu:
    //
    //apelul de metoda cu parametri 1,1,1, adica hasEqualSum(1, 1, 1) va returna  false pentru ca 1 + 1 (suma primilor 2 parametri) nu este egal cu 1 (al 3-lea parametru)
    //apelul de metoda cu parametri 1,1,2, adica hasEqualSum(1, 1, 2) va returna  true pentru ca 1 + 1 (suma primilor 2 parametri) este egal cu 2 (al 3-lea parametru)
    //Defineste metoda (impreuna cu parametri necesari), implementeaz-o, si apoi apeleaz-o in main().
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        boolean hasEqualSum1= computeHasEqualSum(number1,number2,number3);
        boolean hasEqualSum2 = computeHasEqualSum(1,1,1);




        System.out.println(hasEqualSum1);
        System.out.println(hasEqualSum2);
        System.out.println(computeHasEqualSum(1,2,3));



    }

    public static boolean computeHasEqualSum(int number1, int number2, int number3 ){
        boolean hasEqualSum =  number1+number2==number3;
        return  hasEqualSum;


    }
}
