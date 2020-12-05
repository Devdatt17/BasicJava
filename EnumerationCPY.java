//? Tutorial 44
//? More explanation will be added later
public class EnumerationCPY {
    public static void main(String args[]) {
        for (Enumeration peoples : Enumeration.values()) {
            System.out.printf("%s\t%s\t%s\n", peoples, peoples.getDesc(), peoples.getYear());
        }
    }
}
