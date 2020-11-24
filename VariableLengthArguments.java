// ? Variable that takes multiple arguments Tutorial 35

public class VariableLengthArguments {
    public static void main(String args[]) {
        System.out.println(average(43, 56, 73, 87));
        // Pass As may values as you can
    }

    // ! int...variableName can take multiple values passed at a same time
    public static int average(int... numbers) {
        int total = 0;
        for (int x : numbers) {
            total += x;
        }
        return total / numbers.length;
    }
}