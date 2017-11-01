
public class Hat
{
    private String color;
    private int height;
    
    public Hat(String clr, int tall) {
        this.color = clr;
        this.height = tall;
    }
    public String getColor() {
        return this.color;
    }
    public String toString() {
     return "This hat is the color: " + this.color;   
    }
    
}
