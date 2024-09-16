package Metode;

public class Ex8 {
    public static void main(String[] args) {
        //8. Ai o aplicatie de bilete la cinema si vrei sa determini pretul unui bilet.
        // retul normal este de 10 lei. Daca persoana este copil (are varsta mai mica decat 12 ani),
        // sau pensionar (mai mult de 65 de ani), atunci pretul este de 5 lei.
        // In plus, in fiecare marti, este un discount de 2 lei pentru toata lumea.
        //Citeste de la tastatura varsta persoane si ziua din saptamana, apoi afiseaza in consola pretul biletului.

        //inputuri
        int age = 24;
        String dayOfWeek = "Marti";

        //apel metoda
        int price = getPrice(age, dayOfWeek);

        //output
        System.out.println(price);

    }

    public static int getPrice (int age, String dayOfWeek){
        int price = 10;
        //aglrotim

        if (age <= 12 || age >=65){
            price = 5;
        }

        if (dayOfWeek.equals("Marti")){
            price = price - 2;
        }

        return price;
    }
}
