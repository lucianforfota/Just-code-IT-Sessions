public class IfAndMethodsDemo {
    public static void main(String[] args) {
        //apel isEven
        int x = 8;
        boolean isEven = isEven(x);
        if (isEven) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }

        //apel getGrade
        System.out.println(getGrade(75));

        //apel getSmallestNumber
        System.out.println(getSmallestNumber(11, 12));
    }

//    varianta in care folosesc tehnica de presupunere
//    public static boolean isEven(int number) {
//        //presupun ca nu este par (adica bag in isEven false)
//        boolean isEven = false;
//        if (number % 2 == 0) {
//            isEven = true;
//        }
//        return isEven;
//    }

    //  varianta in care returnez direct rezultatul expresiei
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static char getGrade(int score) {
        char grade = ' ';
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static int getSmallestNumber(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return firstNumber;

        } else if (firstNumber > secondNumber) {
            return secondNumber;
        } else {
            return 0;
        }
    }
}

