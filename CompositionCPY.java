//? Composition
//? Tutorial 43
//! A little explaination is remaning
public class CompositionCPY {
    private String name;
    private Composition birthday;

    public CompositionCPY(String theName, Composition theDate) {
        name = theName;
        birthday = theDate;
    }

    public String toString() {
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}
