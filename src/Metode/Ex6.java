package Metode;

import java.util.Scanner;

public class Ex6 {
    //6.Construieste un calculator de baza.
    //Citeste de la tastatura 2 numere si un caracter care sa-ti ofere operatia pe care sa realizezi: +, -, * sau /.
    // Apoi afiseaza rezultatul calculului respectiv in consola.
    // Ai grija sa tratezi cazul in care se face impartire la 0.

    public static void main(String[] args) {
        //citire de la tastatura/dat din burta
        Scanner scanner = new Scanner(System.in);
        double firstNumber = 4;
        double secondNumber = 0;
        //char operation = scanner.nextLine().charAt(0);
        char operation = '/';
        //apel la care pasam ce am citit de la tastatura
        double result = calculate(firstNumber, secondNumber, operation);
        //afisarea rezultatului metodei
        if (result == -2){
            System.out.println("nu se paote imparti la 0");
        }
        System.out.println(result);

    }

    public static double calculate(double firstNumber, double secondNumber, char operation){
        double result = 0;
        //algoritmul
        if (secondNumber == 0 && operation=='/'){
            result = -2;
        } else if (operation == '+'){
            result = firstNumber + secondNumber;
        } else if (operation == '-'){
            result = firstNumber - secondNumber;
        } else if (operation == '*') {
            result = firstNumber * secondNumber;
        } else if (operation == '/') {
            result = firstNumber / secondNumber;
        } else {
            result = -1;
        }
        return result;
    }
}
