package forinterview;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WaveLikeArray {

    public static void main(String[] args) {
        //1,2,3,4,5
        //2,1,4,3,5

        //1,2,2,3,4,5
        //2,1,3,2,5,4

        //1,2,2,2,3,4,5
        //2,1,2,2,4,3,5


    }

    public static void convertToWaveArray(List<Integer> arr){
        //parcurgem arry-ul incepand de la pozitia 1 , pana la length , din 2 in 2
               //interschimbam elementul de la i cu elementeul de la i-1


        for (int i = 1; i < arr.size(); i+=2) {
            swap(i,i-1,arr);
            //in variabila temporara bag elementul de la pozitia i
            //int temp = arr.get(i);
            //la pozitia i bag ce am la pzoitia i-1
            //arr.set(i,arr.get(i-1));
            //la pozitia i-1 bag ce am in temp
            //arr.set(i-1,temp);
        }
    }

    public static void swap(Integer i, Integer j, List<Integer> arr){
        //in variabila temporara bag elementul de la pozitia i
        int temp = arr.get(i);
        //la pozitia i bag ce am la pzoitia i-1
        arr.set(i,arr.get(j));
        //la pozitia i-1 bag ce am in temp
        arr.set(j,temp);
    }
}
