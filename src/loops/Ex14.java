package loops;

public class Ex14 {
    public static void main(String[] args) {
        //14. Printeaza cealalta jumatate de piramida, in functie de un numar n citit de la tastatura.
        //De exemplu, pentru n = 5, se va printa:
        //
        //       #
        //      ##
        //     ###
        //    ####
        //   #####


        int n = 5;

        for (int i = 1; i <= n; i++) {
            //printez spatii
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            //printez dieji

            System.out.println();

        }
    }
}
