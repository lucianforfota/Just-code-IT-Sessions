package loops;

public class EX2 {
    public static void main(String[] args) {
        //2. Scrie un program care afiseaza suma numerelor de la 1 la n.
        //Variatie de cerinta: "Scrie un program care afiseaza primele suma primelor n numere din intervalul [x,y].
        //
        //Dupa ce rezolvi direct in main, poti scrie o metoda care sa rezolve problema.

        int n = 10;
        int i = 1;

        //putput este suma
        int sum = 0;
        while (i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
