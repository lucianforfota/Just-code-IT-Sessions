package loops;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("cate numere vrei sa introuci?");
        int n = scanner.nextInt();

        int i = 0;
        int sum = 0;
        int currentNumber=0;
        while (i< n){
            //citesc de la tastatura si bag in currentNumber
            System.out.println("introdu urmatorul numar");
            currentNumber = scanner.nextInt();
            //adun la suma ceea ce am citit de la tastatura
            sum = sum + currentNumber;
            i++;
        }
        System.out.println(sum);
    }
}
