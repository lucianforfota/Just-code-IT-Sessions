package loops;

public class Ex10 {
    //10. Scrie un program care calculează factorialul unui număr n, n fiind citit de la tastatură
    //De exemplu, factorialul numarului 3 este 1 * 2 * 3 = 6
    //Factorialul numarului 4 este 1 * 2 * 3 * 4 = 24
    //Factorialul numarului 5 este 1 * 2 * 3 * 4 * 5 = 120
    //Practic trebuie inmultite toate numerele consecutive pana la numărul citit de la tastatură.

    public static void main(String[] args) {

        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
