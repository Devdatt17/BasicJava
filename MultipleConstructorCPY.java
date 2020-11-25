//? Multiple Constructors can be created using Multiple Parameters
//? Tutorial 39 40 41 

class MultipleConstructorCPY {
    private int number;
    private int number1;
    private int number2;

    public MultipleConstructorCPY() {
        number = 6;
    }

    public MultipleConstructorCPY(int num) {
        number = num;
    }

    public MultipleConstructorCPY(int num, int num1) {
        number = num;
        number1 = num1;
    }

    public MultipleConstructorCPY(int num, int num1, int num2) {
        number = num;
        number1 = num1;
        number2 = num2;
    }

    public void display() {
        System.out.println("The numbers are: " + number + " " + number1 + " " + number2);
    }

}