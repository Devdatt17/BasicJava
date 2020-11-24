// ? Public Private and this keyword

public class PublicPrivateAndthisCPY {
    private int hour = 1;
    private int minute = 2;
    private int second = 3;

    // ! If the variables of global and local scope have same name then
    // ! this keyword is used
    // ? Before this keyword output for both times was same
    // ? But after this keyword now it is different
    public void setTime(int hour, int minute, int second) {
        this.hour = 4;
        this.minute = 5;
        this.second = 6;
    }

    public String toMilitary() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour), hour, minute, second);
    }
}
