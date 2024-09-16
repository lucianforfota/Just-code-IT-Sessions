package operatori;

public class Ex14 {
    public static void main(String[] args) {
        //14.Un aplicant pentru un credit va obtine creditul daca are un credit score peste 700 si daca are o sursa de venit stabila.
        // Daca creditul este mare (peste 100000 euro), atunci clientul trebuie sa ofere si colateral ca sa fie aprobat.
        // In plus, banca nu trebuie sa fie intr-o perioada in care nu ofera credite.
        //Citeste de la tastatura:
        //
        //int creditScore
        //boolean hasSteadyIncome
        //double loanAmount
        //boolean hasCollateral
        //boolean isBankInCreditFreeze
        //Foloseste variabila isLoanApproved care sa retina daca creditul este aprobat, sau nu.

        int creditScore = 800;
        boolean hasSteadyIncome = true;
        double loanAmount = 30000;
        boolean hasCollateral = false;
        boolean isBankInCreditFreeze = false;

        boolean isLoanApproved = (creditScore > 700) && hasSteadyIncome && ((loanAmount>=100000 && hasCollateral) || loanAmount<100000) && !isBankInCreditFreeze;
    }
}
