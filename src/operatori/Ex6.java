package operatori;

public class Ex6 {
    public static void main(String[] args) {
        //6. Un utilizator poate vizualiza un video premium daca este un membru premium, sau daca a cumparat acel vide. In plus, server-ul trebuie sa fie on-line
        //Citeste de la tastatura:
        //
        //boolean isPremiumMember;
        //boolean hasBoughtVideo;
        //boolean isServerOnline;
        //Foloseste variabila canViewVideo care sa retina daca utilizatorul poate sau nu sa vizualizeze video premium.

        boolean isPremiumMember = true;
        boolean hasBoughtVideo = false;
        boolean isServerOnline =  true;

        boolean canViewVideo = (isPremiumMember || hasBoughtVideo) && isServerOnline;
        System.out.println(canViewVideo);

    }
}
