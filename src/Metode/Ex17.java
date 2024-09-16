package Metode;

public class Ex17 {
    public static void main(String[] args) {
        //17. Scrie un program care citeste de la tastatura 3 numere, reprezentand lugimile laturilor unui triunghi.
        //Trebuie sa afisezi in consola daca cele 3 laturi formeaza un triunghi valid, sau nu.
        // Un triunghi este valid daca suma lungimilor oricaror doua laturi este mai mare decat lugimea
        // celei de-a 3-a laturi.
        double first = 4;
        double second = 5;
        double third = 3;

        boolean isValid = isValid(first, second, third);

        if (isValid){
            System.out.println("este triunghi valid");
        } else{
            System.out.println("nu este triunghi valid");
        }

    }

    public static boolean isValid (double first, double second, double third){
        if (first <= 0 || second <= 0 || third <= 0){
            return false;
        }
        return first + second > third || first + third > second || second + third > first;
    }
}
