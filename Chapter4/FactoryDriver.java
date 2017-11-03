
public class FactoryDriver
{
    public static void main(String[] args) {
        Factory tesla = new Factory(2000, 50);
        Car c = new Car(2017, "model 3");
        tesla.setCar(c,0);
        System.out.println(tesla);
        
    }
}
