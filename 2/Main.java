public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(160, "Sport");
        System.out.println(car.getType() + ": Allowed speed = " + 
            new SpeedCalculation().calculateAllowedSpeed(car));
        
        Vehicle bus = new Bus(100, "City");
        System.out.println(bus.getType() + ": Allowed speed = " + 
            new SpeedCalculation().calculateAllowedSpeed(bus));
    }
}