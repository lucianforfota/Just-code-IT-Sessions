package Metode;

import java.util.Scanner;

public class Ex2 {
    //2. [LIVE] Produci software pentru un fierbator de apa. Citeste de la tastatura temperatura curenta a apei si:
    //Var1: afiseaza un mesaj corespunzator daca temperatura este mai mare de 100 de grade (apa fierbe)
    //Var2: afiseaza un mesaj corespunzator daca apa fierbe, si un alt mesaj corespunzator in caz contrar
    //Var3: afiseaza un mesaj corespunzator daca temperatura este mai mare de 100 de grade (apa fierbe),
    // un alt mesaj daca temperatura este mai mica decat 50 de grade (apa este in curs de fierbere)
    // si un alt daca apa are temperatura intre 50 si 100 de grade (apa este aproape fiarta)

    public static void main(String[] args) {
        //citesc de la tastatura sau dau din burta
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        //int tempretaure = 120;
        //pasez ce la metoda input-ul din variabila temperature si preiau rezultatul intr-o cutie
        String message = getMessage(temperature);
        String anotherMessage = getMessage(120);
        //afisez mesajul din cutie
        System.out.println(message);
        System.out.println(anotherMessage);
    }

    //semnatura metodei
    //cuvintele public static - le scriem si nu ne intereseaza ce inseamna
    //ce iese din metoda (tipul returnat)
    //cum se numeste metoda (ce face ea, daca ar fi sa exprima printr-un verb)
    //ce intra in metoda (parametri)
    //output-ul este de tip String si reprezinta mesajul ("apa fierbe", etc.)
    public static String getMessage (int temperature){
        String result = "";
        //algoritmul
        if (temperature >= 100) {
             result = "apa fierbe";
        } else if (temperature >= 50) {
             result ="apa este aproape fiarta";
        } else if (temperature > 0) {
             result = "apa este in curs de fierbere";
        } else {
           result = "apa a inghetat";
        }
        return result;
    }

}
