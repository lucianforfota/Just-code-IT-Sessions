package Metode;

import java.util.Scanner;

public class WhatsYourName {
    public static void main(String[] args) {
        String name = getName();
        sayHello(name);
    }

    public static void sayHello(String to){
        System.out.println("heloo " + to);
    }

    public static String getName(){
        //pregatesc scanner-ul pentru a citi de la tastatura
        Scanner scanner = new Scanner(System.in);

        //afisez un mesaj in consola
        System.out.println("what's your name?");

        //astept ca utilizatorul sa imi introduca in text, prin comanda "scanner.nextLine()".
        //iar rezultatul (ceea ce imi da utilizatorul) il atribui variabilei answer
        String answer = scanner.nextLine();
        return answer;
    }
}
