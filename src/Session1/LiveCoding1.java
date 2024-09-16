package Session1;

public class LiveCoding1 {

    public static void main(String[] args) {
        //declarare si initializare variabile
        String city = "Cluj-Napoca";
        String country = "Romania";

        //doar declarare variabila
        int population;
        //initializare variabila
        population = 100000;

        //ASA NU! (nu respecta convetia "camel case")
        String thisisavariableandidontundersantdwhatitis;
        //ASA DA! (respecta conventia "camel case")
        String evenIfTheNameIsLongICanReadIt;

        //retinem informatiile unui produs dintr-un magazin online, utilizand diferite variabile si tipuri de date
        String productName1 = "mustar";
        double price1 = 4.99;
        boolean isAvailable1 = true;
        char nutriScore1 = 'C';
        boolean isBio1 = false;

        //afisam in consola informatiile produsului
        System.out.println(productName1);
        System.out.println(price1);
        System.out.println(isAvailable1);
        System.out.println(nutriScore1);
        System.out.println(isBio1);

        //retinem informatiile celui de-al doilea produs
        String productName2 = "ketchup";
        double price2 = 20.99;
        boolean isAvailable2 = true;
        char nutriScore2 = 'A';
        boolean isBio2 = true;

        double totalAmount = price1 + price2;
        System.out.println(totalAmount);

        //rezultatul expresiei "price1<price2" este o valoare booleana (adevarat sau fals), pe care o atribuim variabilei isMustardCheaper
        boolean isMustardCheaper = price1<price2;
        System.out.println(isMustardCheaper);

    }
}
