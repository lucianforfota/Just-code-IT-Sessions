package operatori;

public class Ex9 {
    public static void main(String[] args) {
        //9.Un angajat este eligibil pentru o promovare daca lucreza in companie de cel putin 5 ani si
        // scorul de performanta este mai mare decat 8, sau daca are o recomandare de la manager si nu are sanctiuni disciplinare.
        // Totusi, promovarea se poate face doar daca compania nu are promovarile inghetate.
        //Citeste de la tastatura:
        //
        //int yearsWorked
        //double performanceScore
        //boolean hasManagerRecommendation
        //boolean hasDisciplinaryAction
        //boolean isPromotionFreeze
        //Foloseste variabila isEligibleForPromotion care sa retina daca angajatul poate promova, sau nu.

        int yearsWorked = 6;
        double performanceScore = 7.0;
        boolean hasManagerRecommendation = true;
        boolean hasDisciplinaryAction = true;
        boolean isPromotionFreeze = true;

        boolean isEligibleForPromotion =  !isPromotionFreeze && ((yearsWorked >= 5 && performanceScore > 8.0) || (hasManagerRecommendation && !hasDisciplinaryAction));
        System.out.println(isEligibleForPromotion);
    }
}
