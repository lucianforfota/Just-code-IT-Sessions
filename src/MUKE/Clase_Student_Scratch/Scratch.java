package MUKE.Clase_Student_Scratch;


public class Scratch {

    public static void main(String[] args) {
        Student s1 = new Student("maria");
        //s1 pointeaza la o casuta de memorie
        System.out.println(s1.name);
        changeStudent(s1);
        System.out.println(s1.name);


    }

    public static void changeStudent(Student student) {
        //paramentrul fuctiei changeStudent de tip student, adica Student student care practic e o cpoie a lui s1 pointeaza la aceeasi adresa de memorie a lui s1
        student.name = "muke";
        //aici practic obiectele "s1" si "student" pointeaza la aceasi adresa de memorie.daca schimb orice atribut la oricare din aceste obiecte care pointeaza la aceasta adresa de memorie
        // atunci numele din acea adresa de memorie se schimba la "muke" pentru amandoua din aceste obiecte

        student = new Student("forfota");
        System.out.println(student.name);
    }
}