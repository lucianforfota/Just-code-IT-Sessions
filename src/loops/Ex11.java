package loops;

public class Ex11 {
    //11. Scrie un program care sa calculeze suma cifrelor unui număr, numărul fiind citit de la tastatura.

    public static void main(String[] args) {

        int n = 1234;
        int sum = 0;

        while (n > 0){
            //extrag ultima cigfra
            ///adun cifra extrasa la suma
            sum = sum + n % 10;
            //retunut la ultima cifra
            n = n/10;
        }

        System.out.println(sum);



    }
}
