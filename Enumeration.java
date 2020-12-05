//? Tutorial 44
//? More explanation will be added later
public enum Enumeration {
    person1("dumb", "22"), person2("good", "10"), person3("best", "12");

    private final String desc;
    private final String year;

    Enumeration(String description, String yr) {
        desc = description;
        year = yr;
    }

    public String getDesc() {
        return desc;
    }

    public String getYear() {
        return year;
    }
}
