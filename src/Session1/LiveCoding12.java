package Session1;

import java.util.Scanner;

public class LiveCoding12 {
    public static void main(String[] args) {
        //pregatesc scanner-ul pentru a citi de la tastatura
        Scanner scanner = new Scanner(System.in);

        //afisez un mesaj in consola
        System.out.println("what's your name?");

        //astept ca utilizatorul sa imi introduca in text, prin comanda "scanner.nextLine()".
        //iar rezultatul (ceea ce imi da utilizatorul) il atribui variabilei answer
        String answer = scanner.nextLine();

        //afisez textul format din "hello" si valoarea variabilei "answer"
        System.out.println("hello " + answer);
    }
}
