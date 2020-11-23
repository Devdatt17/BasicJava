//
//? Multiple Methods And Instances Tutorial 16
/*
! A variable out Side of the method but inside of the class
! is called as Instance Variable
*/
public class MultipleMethodsAndInstancesT16 {
    private String girlName; // ? this is an instance variable

    public void setName(String name) {
        girlName = name;
    }

    public String getName() {
        return girlName;
    }

    public void saying() {
        System.out.printf("Your first gf was %s ", getName());
    }
}
