package by.zasinets.qa;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("black", 3);
        Rectangle rectangle = new Rectangle("red", 3, 3);
        Triangle triangle = new Triangle("blue", 4, 4);

        String colorCircle = circle.getColor();
        String colorRectangle = rectangle.getColor();
        String colorTriangle = triangle.getColor();

        System.out.println("Circle: " + colorCircle);
        System.out.println("Rectangle: " + colorRectangle);
        System.out.println("Triangle: " + colorTriangle);

        System.out.println(" ");

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
