package loops;

public class Ex5 {
    //5. Scrie un program care afiseaza cate numere pare sunt in intervalul [1-n].


    public static void main(String[] args) {

        int n = 10;
        //int i = 1;
        //output
        int counter = 0;

//        while (i<=n){
//            if (isEven(i)){
//                counter++;
//            }
//            i++;
//        }
        for (int i = 1; i <= n; i++) {
            if (isEven(i)){
                counter++;
            }
        }

        System.out.println(counter);

    }

    public static boolean isEven (int number){
        return number%2==0;
    }
}
