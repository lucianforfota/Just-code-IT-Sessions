package Metode;

//2. Creeaza o metoda numita getAge(), care primeste ca parametru anul nasterii unei persoane
// Metoda va returna varsta persoanei. De exemplu:

//apelul de metoda cu parametrul 2000, adica getAge(2000) va returna valoarea 24 pentru "anul curent - 2000 = 24"


import java.util.Scanner;

public class H_ex2_Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tasteaza anul tau de nastere");
        int yearOfBirth = scanner.nextInt();

      int getAge=getAge(yearOfBirth);
        System.out.println(getAge);


    }
    public static int getAge(int yearOfBirth) {
        int getAge = 2024 - yearOfBirth;
        return getAge;
    }

    }
