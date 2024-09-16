package loops;

public class Ex9 {
    //9. Scrie un program care afiseaza numerele din sirul fibonacci pana la maxim n, n fiind citit de la tastatura.
    //Sirul fibonacci are urmatoarea regula: fiecare numere din sir este egal cu suma precedentelor
    // doua numere din sir. Primele doua numere sunt intodeauna 0 si 1.
    //
    //0, 1, 1, 2, 3, 5, 8, 13, 21, ...

    public static void main(String[] args) {

        int n = 9;
        int first = 0;
        System.out.println(first);
        int second = 1;
        System.out.println(second);

        int i = 0;
        int third = 0;
        //
        while (i<n){
            //facem suma intre first si second
            third = first + second;
            System.out.print(third);
            //al doilea devine primul
            first = second;
            //al 3lea devine al doilea
            second = third;
            i++;
        }
    }
}
