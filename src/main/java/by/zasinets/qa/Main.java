package by.zasinets.qa;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("black",3);
        Rectangle rectangle = new Rectangle("red",3,3);
        Triangle triangle = new Triangle("blue",4,4);

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(triangle.calculateArea());

        System.out.println(circle.perimeter());
        System.out.println(rectangle.perimeter());
        System.out.println(triangle.perimeter());


    }
}
