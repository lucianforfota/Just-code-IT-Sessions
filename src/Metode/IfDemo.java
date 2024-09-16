public class IfDemo {
    public static void main(String[] args) {

        //exemplul 1
        int firstNumber = 10;
        int secondNumber = 10;

        if (firstNumber < secondNumber) {
            System.out.println("first number is smaller");
        } else if (firstNumber > secondNumber) {
            System.out.println("second number is smaller");
        } else {
            System.out.println("they are equal");
        }

        //exemplul 2
        int firstNum = 10;
        int secondNum = 10;

        //se mai poate pune si intrebarea: if (firstNum == secondNum)
        //se mai poate pune si intrebarea: if (firstNum != secondNum)
        if (firstNum < secondNum || firstNum > secondNum) {
            System.out.println("nu sunt egale");
        } else {
            System.out.println("egale");
        }

        //exemplul 3
        int score = 35;

        if (score>100 || score<0){
            System.out.println("scor invalid");
        }

        if (score >= 90){
            System.out.println("A");
        } else if (score>=80){
            System.out.println("B");
        } else if (score>=70){
            System.out.println("C");
        } else if (score>=60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        //exemplul 4
        int x = 8;
        if (x % 2 == 0) {
            System.out.println("numar par");
        } else {
            System.out.println("numar impar");
        }
    }
}