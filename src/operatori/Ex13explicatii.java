package operatori;

public class Ex13explicatii {

    public static void main(String[] args) {
//        13.Un angajat poate sa rezerve un meeting room doar daca este disponibil si daca nu a depasit numarul de rezervari per saptamana.
// Daca camera este o camera speciala (cu multe locuri), atunci poate fi rezervata doar daca echipa angajatului are mai mult de 10 membri.
//    Citeste de la tastatura:
//
//    boolean isRoomAvailable
//    boolean isQuotaExceeded
//    boolean isHighCapacityRoom
//    int teamSize
//    Foloseste variabila canBookRoom care sa retina daca angajatul poate sa rezerve sala, sau nu.

        boolean isRoomAvailable = true;
        boolean isQuotaExcedeed = true;
        boolean isHighCapacityRoom = false;
        int teamSize = 8;

        //nu este camera speciala SAU (este camera speciala SI echipa e mai mare decat 10)
        boolean canBookRoom = isRoomAvailable && isQuotaExcedeed && (!isHighCapacityRoom || (isHighCapacityRoom && teamSize>=10));

        //pot sa rezerv camera daca: este disponibila SI NU e depasit numarul de rezervari pe satptamna SI daca caemra este speciala SI daca marimea echipei este mai mare decat 10
        //fals

        //nu are oameni la bord SAU (are oameni SI este misiune de salvare)


    }
}
