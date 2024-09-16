package operatori;

public class Ex16 {
    public static void main(String[] args) {
        //16.O retea securizata poate fi accesata daca utilizatorul este un angajat si are badge-ul activ,
        // sau daca este un contractor cu badge-ul activ si cu contractul neexpirat.
        // In plus, trebuie sa nu fie o perioada de mentenanta a retelei.
        //Citeste de la tastatura:
        //
        //boolean isEmployee
        //boolean isContractor
        //boolean isBadgeActive
        //boolean isContractExpired
        //boolean isMaintenanceHour
        //Foloseste variabila canAccessNetwork care sa retina daca reteaua poate fi accesata, sau nu.

        boolean isEmployee = false;
        boolean isContractor = true;
        boolean isBadgeActive = false;
        boolean isContractExpired = false;
        boolean isMaintenanceHour = false;

        boolean canAccessNetwork = ((isEmployee && isBadgeActive) || (isContractor && !isContractExpired && isBadgeActive)) && !isMaintenanceHour;
        boolean canAccessNetwork2 = ((isEmployee || (isContractor && !isContractExpired)) && isBadgeActive) && !isMaintenanceHour;

    }
}
