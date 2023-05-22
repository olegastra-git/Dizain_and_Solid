public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        Shape square = new Square(30);

        int rectangleArea = rectangle.area();
        int squareArea = square.area();

        System.out.println("Rectangle area = " + rectangleArea);
        System.out.println("Square area = " + squareArea);
    }
}