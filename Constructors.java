//? Constructors Tutorial 17 
public class Constructors {
    private String girlName;

    // ? constructors are methods that have same name as class
    // ? constructors do not have return type not even void
    // ? constructors initalize the object instantly after its creation

    // ! this is the constructor
    public Constructors(String name) {
        girlName = name;
    }

    public String getName() {
        return girlName;
    }

    public void saying() {
        System.out.printf("Your first gf was %s", getName());
    }
}
