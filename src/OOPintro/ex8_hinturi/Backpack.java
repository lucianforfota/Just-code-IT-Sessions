package OOPintro.ex8_hinturi;

public class Backpack {


    int numberOfBooks;

    int maxWeight;

    int currentWeight;

    Book[] books;

    public Backpack(int capacity, int numberOfBooks, int maxWeight) {

        this.numberOfBooks = numberOfBooks;
        this.maxWeight = maxWeight;
        this.books = new Book[numberOfBooks];
    }
}
