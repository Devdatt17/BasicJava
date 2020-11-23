//? Enhanced for loop Tutorial 31

public class EnhancedForLoop {
    public static void main(String args[]) {
        int arrayOfNumbers[] = { 3, 5, 7, 8, 9, 4, 2, 4, 7 };
        int sumOfArray = 0;

        // ! This is Enhanced for loop
        for (int x : arrayOfNumbers) {
            // * this adds each of the elements from the array
            // ?
            // It works just like
            // for(int i=0;i<arrayOfNumbers.length();i++){
            // sumOfArray += arrayOfNumber[i];
            // }
            sumOfArray += x;
            System.out.println(sumOfArray);

        }
    }
}
