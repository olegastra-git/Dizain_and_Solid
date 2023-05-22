public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Площадь круга: " + circle.area());

        Cube cube = new Cube(4);
        System.out.println("Площадь куба: " + cube.area());
        System.out.println("Объем куба: " + cube.volume());
    }
}