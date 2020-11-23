//? Multiple Methods And Instances Tutorial 16

/*
! A variable out Side of the method but inside of the class
! is called as Instance Variable
*/

import java.util.Scanner;

public class MultipleMethodsAndInstancesT16CPY {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MultipleMethodsAndInstancesT16 classObject = new MultipleMethodsAndInstancesT16();
        System.out.println("Enter the name of first gf here : ");
        String temp = sc.nextLine();
        classObject.setName(temp);
        classObject.saying();

        sc.close();
    }
}
