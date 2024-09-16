package loops;

public class Ex15 {

    //15. Scrie un program care sa determine cat timp (in ani) ii ia unei populatii sa ajunga la o anumita marime.
    //Initial, pornim cu o populatie de n oi. In fiecare an, n/3 oi noi se nasc, si n/4 oi mor.
    //
    //De exemplu, daca am pornit cu o populatie de n = 1200 de oi, in primul an 1200/3=400 de oi se nasca si 1200/4=300 de oi mor.
    //Asa ca la sfarsitul anului vom avea 1200 + 400 - 300 = 1300 oi
    //Citeste de la tastatura populatia initiala (startSize) si populatia la care vrei sa ajungi (endSize)\
    //
    //Daca utilizatorul introduce un startSize mai mic decat 9, cere-i sa introduca valori in continuare pana cand introduce minim numarul 9
    //Daca utilizatorul introduce un endSize mai mic decat startSize-ul introdus enterior, cere-i sa introduca valori in continuare pana cand introduce o valoare mai mare decat startSize
    //Programul trebuie sa calcueze numarul de ani necesari ca populatia sa creasca la valoarea endSize

    int startSize = 1200;
    int endSize = 2000;

    //initial numarul de ani este 0;

    //atata timp cat ( start size mai mic de cat endsize )
       //calculez cate se nasc (start size imparti la 3)
       //calculez cate mor (start size impartit la 4)
       //actualizez populatia ( startSzie devine startSie + cei nascuti - cei morti)
       //a mai trecut un an

}
