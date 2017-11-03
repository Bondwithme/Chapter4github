
public class CarDriver
{
    public static void main(String[] args) {
        Car myCar = new Car(2013, "prius");
        System.out.println(myCar);
        
        Car yourCar = new Car(2010, "Ford");
        System.out.println(myCar.equals(yourCar));
    }
}
