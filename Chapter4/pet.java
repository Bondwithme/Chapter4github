
public class pet
{
    private String name;
    private String breed;
    public pet(String type, String nm)
    {
        this.name = nm;
        this.breed = type;
        
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return "This pet is named: " + this.name;
    }
    public void setBreed(String type) {
        
    }
    public static void example() {
       System.out.println("This is static"); 
    }
}
