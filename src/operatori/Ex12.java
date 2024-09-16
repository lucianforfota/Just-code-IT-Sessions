package operatori;

public class Ex12 {
    public static void main(String[] args) {
        //12.O racheta poate decola daca are nivelul de combustibil mai mare decat 50%,
        // daca toate sistemele functioneaza (reprezentate de un system check), si daca vremea este buna.
        // Racheta nu poate decola daca are oameni la bord. Exceptia este ca poate decola cu oameni la bord, daca este o misiune de salvare
        //Citeste de la tastatura:
        //
        //double fuelLevel
        //boolean isSystemsCheckPassed
        //boolean isWeatherClear
        //boolean hasLivingCreaturesInCargo
        //boolean isRescueMission
        //Foloseste variabila canTakeOff care sa retina daca racheta poate sa decoleze, sau nu.

        double fuelLevel = 60;
        boolean isSystemsCheckPassed = true;
        boolean isWeatherClear = true;
        boolean hasLivingCreaturesInCargo = true;
        boolean isRescueMission = false;

        //nu are oameni la bord SAU (are oameni SI este misiune de salvare)

        boolean canTakeOff = (fuelLevel>50) && isSystemsCheckPassed && isWeatherClear && (!hasLivingCreaturesInCargo ||  (hasLivingCreaturesInCargo && isRescueMission));
        System.out.println(canTakeOff);
    }
}
