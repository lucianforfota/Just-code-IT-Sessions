package forinterview;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfDigits {

    public static void main(String[] args) {


        //ab22n3m2l1p1
        //112223ablmn


    }

    public static Map<Character, Integer> getDigitsFrequency (String s){
        //pentru fiecare caracter din string
           //daca carcaterul curent este cifra
               //daca mapa nu contine cheia caracterul curent
                   //adaug in mapa ca si cheie cifra si ca si valoare 1
               //altfel
                   //in mapa adaug la valoarea de la cheia caracterul curent 1
        //returnam mapa

        Map<Character,Integer> digitsFrequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                if (!digitsFrequency.containsKey(s.charAt(i))) {
                    digitsFrequency.put(s.charAt(i), 1);
                } else {
                    digitsFrequency.put(s.charAt(i), digitsFrequency.get(s.charAt(i)) + 1);
                }
            }
        }

        return digitsFrequency;
    }


}
