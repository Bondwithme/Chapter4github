
public class Car
{
    private String model;
    private int year;
    public Car(int date, String type) {
        this.model = type;
        this.year = date;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public String toString() {
       return "The car is a: " + this.model; 
    }
    public boolean equalsCar(Car othercar) {
        if(this.model.equals(othercar.model) && this.year == othercar.year) {
            return true;
        }
        else {
            return false;   
        }
    }
}
