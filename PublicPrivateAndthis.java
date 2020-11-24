// ? Public Private and this keyword Tutorial 38

public class PublicPrivateAndthis {
    public static void main(String args[]) {
        System.out.println("Before this keyword ");
        PublicPrivateAndthisCPY newObject = new PublicPrivateAndthisCPY();
        System.out.println(newObject.toMilitary());
        System.out.println(newObject.toString());

        System.out.println("After this keyword ");
        newObject.setTime(13, 27, 6);
        System.out.println(newObject.toMilitary());
        System.out.println(newObject.toString());

    }
}