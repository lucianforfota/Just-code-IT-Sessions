package loops;

public class Ex3 {
    public static void main(String[] args) {
        //3. Scrie un program care afiseaza numerele pare din intervalul [1-n].
        //Variatie de cerinta: "Scrie un program care afiseaza primele primele n numere pare din intervalul [x,y].
        //
        //Dupa ce rezolvi direct in main, poti scrie o metoda care sa rezolve problema. Metoda ta va apela la randul ei
        // (pe scris algoritmului)
        // alta metoda tot de tine care verifica daca un numar este par.

        int n = 10;
        //int i = 1;
//        while (i<=n){
//            if (isEven(i)){
//                System.out.println(i);
//            }
//            i++;
//        }

        for (int i = 1; i <= n; i++) {
            if (isEven(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isEven (int number){
        return number%2==0;
    }
}
