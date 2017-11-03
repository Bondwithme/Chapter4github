
public class Factory
{
    private double sqFt;
    private Car[] inventory;
    public Factory(double sqFt, int number) {
       this.inventory = new Car[number];
       
    }
    public void setCar(Car c, int index) {
        inventory[index] = c;
    }
    public String toString() {
        String output = "THis factory has \n";
        for(Car c : inventory) {
            output += c + "\n";
        }
        
        return output;
    }
}
