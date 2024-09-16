package forinterview;

import java.util.HashSet;
import java.util.Set;

public class NotCommonCharacters {

    public static void main(String[] args) {
        //abcdeflmn N
        //defxyz M

        //abclmnxyz
    }

    public static String findUncommonChars(String s1, String s2){
        //puntem caracterele din primul cuvant intr-un set
        //punem caracterele din al doilea cuvant intr-un set
        //pentru fiecare caracter din primul cuvant
            //daca al doilea set nu contine carcaterul curent
                //adaug caracterul curent in string-ul rezultat


        //pentru fiecare caracter din al doilea cuvant
            //daca al primul set nu contine carcaterul curent
                //adaug caracterul curent in string-ul rezultat

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            set1.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            set2.add(s2.charAt(i));
        }

        for(char c: set1){
            if(!set2.contains(c)){
                result+=c;
            }
        }

        for(char c: set2){
            if(!set1.contains(c)){
                result+=c;
            }
        }


        return result;
    }






























}
