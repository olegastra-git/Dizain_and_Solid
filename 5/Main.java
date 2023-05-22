public class Main {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Engine dieselEngine = new DieselEngine();

        Car petrolCar = new Car(petrolEngine);
        petrolCar.start();

        Car dieselCar = new Car(dieselEngine);
        dieselCar.start();
    }
}