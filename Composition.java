//* Composition
//* Tutorial 43
public class Composition {
    private int month;
    private int day;
    private int year;

    public Composition(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
        // ? Returns a string representation of the object
        // ? In general, the toString method returns a string that "textually
        // ?represents"
        // ? this object
        System.out.printf("The constructor for this is %s\n", this);
    }

    // * In-build function
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
