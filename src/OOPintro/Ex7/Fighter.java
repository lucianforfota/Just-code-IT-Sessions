package OOPintro.Ex7;

public class Fighter {

    String name;
    int health ;
    int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}



//    7. Creeaza un mini joc de lupte
//Jocul trebuie sa aiba o functie care sa returneze numele castigatorului unei lupte la care participa doi luptatori.
// Fiecare lupator ataca pe rand celalalt luptator si cel care il omoara pe celalalt primul, castiga (adica castiga cel care ramane in viata).
// Un jucator moare atunci cand health-ul lui este mai mic sau egal cu 0. Un luptator are urmatoarele atribute:
//
//health
//damagePerAttack (cat din health i se scade celuilalt jucator, atunci cand jucatorul curent ataca)
//name
// Se vor citi de la tastatura atributele celor 2 jucatori, dar si care dintre jucatori va ataca primul.