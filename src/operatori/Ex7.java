package operatori;

public class Ex7 {
    public static void main(String[] args) {
        //7.Un student poate sa participe la un curs avansat daca a completat “prerequisites” (adica anumite cursuri anterioare)
        // si daca nota medie in prerequisites este A sau B. Cursul trebuie sa aiba, de asemenea, locuri libere.
        //Citeste de la tastatura:
        //
        // boolean hasCompletedPrerequisites
        // char gradeInPrerequisites
        // boolean hasOpenSpots
        //Foloseste variabila canTakeCourse care sa retina daca studentul poate sa participe la curs, sau nu.

        boolean hasCompletedPrerequisites = true;
        char gradeInPrerequisites = 'A';
        boolean hasOpenSpots = true;

        boolean canTakeCourse = hasCompletedPrerequisites && (gradeInPrerequisites == 'A' || gradeInPrerequisites == 'B') && hasOpenSpots;
        System.out.println(canTakeCourse);

    }

}