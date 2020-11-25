//? Multiple Constructors can be created using Multiple Parameters
//? Tutorial 39 40 41 

public class MultipleConstructor {
    public static void main(String args[]) {
        // * We can create multiple constructors by passing
        // * different number of paramenters
        MultipleConstructorCPY newObject = new MultipleConstructorCPY();
        // newObject.Ending();
        MultipleConstructorCPY newObject_1 = new MultipleConstructorCPY(10);
        // newObject_1.Ending();
        MultipleConstructorCPY newObject_2 = new MultipleConstructorCPY(10, 30);
        // newObject_2.Ending();
        MultipleConstructorCPY newObject_3 = new MultipleConstructorCPY(10, 30, 45);
        // newObject_3.Ending();

        newObject.display();
        newObject_1.display();
        newObject_2.display();
        newObject_3.display();
    }
}
