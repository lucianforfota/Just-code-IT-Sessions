package sorting;

public class Selectionsort_test {

    //pentru fiecare element din array
    // gasesc minimul din dreapta lui
    // interschimb minimul cu elementul meu

    //7  2  5  4  1  6  0  3

    public static void main(String[] args) {

        int[] a = {7,2,5,4,1,6,0,3};
        int[] b = {7,2,5,4,1,6,0,3};
        int c=10000;

        selectionSort(a,700000);


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
//        System.out.println(c);
    }

    public static void selectionSort(int[] a,int c){
        for (int i = 0; i < a.length-1; i++) {
            //gasesc pozitia elementului minim din dreapta lui
            int minIdx = getMinIndexAfterIndex(a, i);
            swap(minIdx, i, a,c);
            System.out.println(c);
           /* int minIdx = i+1;

            for (int j = i+1; j < a.length ; j++) {
                if(a[j]<a[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = a[i];
            a[i] = a[minIdx];
            a[minIdx] = temp;*/

        }
    }
    public static int getMinIndexAfterIndex(int[] a, int i){
        int minIdx = i+1;
        for (int j = i+1; j < a.length ; j++) {
            if(a[j]<a[minIdx]) {
                minIdx = j;
            }
        }
        return minIdx;
    }

    public static void swap(int index1, int index2, int[] b,int c){
        int temp = b[index1];
        b[index1] = b[index2];
        b[index2] = temp;
        c=8;
    }


}
