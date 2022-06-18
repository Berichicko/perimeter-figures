package by.zasinets.qa;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("black", 3);
        Rectangle rectangle = new Rectangle("red", 3, 3);
        Triangle triangle = new Triangle("blue", 4, 4);
        System.out.println("Perimeter of circle: " + circle.perimeter());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
        System.out.println("Perimeter of triangle: " + triangle.perimeter());
    }
}
