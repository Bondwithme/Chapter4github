
public class Athlete
{
    private String name;
    private int age;
    public Athlete(String nm, int years) {
        this.name = nm;
        this.age = years;
    }
    public String toString() {
        return "The athlete's name is " + name +" and his age is " + age;
    }
}
