
public class Author
{
    private String name;
    private int age;
    public Author(String nm, int years) {
        this.name = nm;
        this.age = years;
    }
    public String toString() {
        return "The authors name is " + name + " and he is " + age + " years old";
    }
}
