package by.zasinets.qa;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("black", 3);
        Rectangle rectangle = new Rectangle("red", 3, 3);
        Triangle triangle = new Triangle("blue", 4, 4);

        double resultAreaCircle = circle.calculateArea();
        double resultAreaTriangle = rectangle.calculateArea();
        double resultAreaRectangle = triangle.calculateArea();

        System.out.println("Area of circle: " + resultAreaCircle);
        System.out.println("Area of rectangle: " + resultAreaRectangle);
        System.out.println("Area of triangle: " + resultAreaTriangle);

        System.out.println(" ");

        double resultPerimeterCircle = circle.calculatePerimeter();
        double resultPerimeterTriangle = rectangle.calculatePerimeter();
        double resultPerimeterRectangle = triangle.calculatePerimeter();

        System.out.println("Perimeter of circle: " + resultPerimeterCircle);
        System.out.println("Perimeter of rectangle: " + resultPerimeterTriangle);
        System.out.println("Perimeter of triangle: " + resultPerimeterRectangle);
    }
}
