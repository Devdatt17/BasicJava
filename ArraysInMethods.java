//? Passing array as parameter Tutorial 32

public class ArraysInMethods {
    public static void main(String args[]) {
        int bucky[] = { 3, 4, 5, 7, 9 };
        changeArray(bucky);

        for (int y : bucky) {
            System.out.println(y);
        }
    }

    // ? Using static you can directly use the method by directly calling
    // ? We do not need to call it seperately
    public static void changeArray(int x[]) {
        for (int counter = 0; counter < x.length; counter++) {
            x[counter] += 5;
        }
    }
}
