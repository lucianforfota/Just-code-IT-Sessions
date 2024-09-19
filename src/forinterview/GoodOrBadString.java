package forinterview;

public class GoodOrBadString {

    public static void main(String[] args) {
        //aeioup?? GOOD
        //bcdaeiou?? BAD


    }

    public static boolean isGoodString(String s){
        //pentru fiecare caracter din string
           //daca caracterul curent este consoana
                //incrementam nr consoane
                //resetam nr vocale la 0
           //altfel daca c curent este vocala
                //incrementam nr vocale
                //resetam nr consoane la 0
           //altfel
                //incrementam nr consoane
                //incrementam nr vocale
           //daca nrc mai mare decat 3 sau nrv mai mare decat 5
                //return false
        //return true


        int countC = 0;
        int countV = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isConsoana(s.charAt(i))){
                countC++;
                countV=0;
            } else if (isVocala(s.charAt(i))){
                countV++;
                countC=0;
            } else{
                countV++;
                countC++;
            }
            if(countC > 3 || countV>5){
                return false;
            }
        }
        return true;
    }
}
