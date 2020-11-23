//? Random Numbers Tutorial 23

import java.util.*;

public class RandomNumbers {
    public static void main(String[] args) {
        Random randomnumber = new Random();
        int number; // ? To store the random number

        // we are gonna create dice and roll it 10 times
        for (int counter = 1; counter <= 10; counter++) {
            number = 1 + randomnumber.nextInt(6); // without THAT 1+ we will get number form 0 to 5
            System.out.print("  " + number);
        }
    }
}
