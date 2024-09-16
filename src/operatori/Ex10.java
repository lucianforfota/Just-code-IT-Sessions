package operatori;

public class Ex10 {
    public static void main(String[] args) {
        //10.Un utilizator poate accesa o pagina secreta de pe un website daca are rolul de administrator sau daca are atat rolul de manager
        // si este si parte din proiectul paginii secrete. In plus, utilizatorul trebuie sa aiba 2FA (two factor authentication)
        // si sa nu fie marcat cu activitate suspicioasa. In plus, server-ul trebuie sa fie pornit.
        //Citeste de la tastatura:
        //
        // boolean isAdministrator
        // boolean isManager
        // boolean isPartOfProject
        // boolean hasTwoFactorEnabled
        // boolean isFlaggedSuspicious
        // boolean isServerUp
        //Foloseste variabila canAccessPage care sa retina daca utilizatorul poate accesa pagina secreta, sau nu.

         boolean isAdministrator = true;
         boolean isManager = false;
         boolean isPartOfProject = true;
         boolean hasTwoFactorEnabled = true;
         boolean isFlaggedSuspicious = false;
         boolean isServerUp = true;

         boolean canAccessPage = (isAdministrator || (isManager && isPartOfProject)) && hasTwoFactorEnabled && !isFlaggedSuspicious && isServerUp;
    }
}
