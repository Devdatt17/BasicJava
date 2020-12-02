//? Composition
//? Tutorial 43
public class CompositionObject {
    public static void main(String args[]) {
        Composition object1 = new Composition(4, 5, 7);
        CompositionCPY object2 = new CompositionCPY("Devdatt", object1);

        System.out.println(object2);
    }
}