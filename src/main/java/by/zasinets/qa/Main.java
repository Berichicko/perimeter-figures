package by.zasinets.qa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожаллуйста введите radius, для нахождения периметра круга по формуле (P = 2  × π × radius): ");
        double radius = scanner.nextInt();
        Circle circle = new Circle("пурпурный", radius);
        String colorCircle = circle.getColor();
        System.out.println("\u001B[35m" + "Круг: " + colorCircle);
        System.out.println("\u001B[35m" + "Периметр (P = 2  × π × radius) кргуа =  " + circle.calculatePerimeter());
        System.out.println(" ");

        System.out.println("\u001B[0m" + "Пожаллуйста введите length и width, для нахождения периметра прямоугольника по формуле (P = 2 × (length + width) )");
        double length = scanner.nextInt();
        double width = scanner.nextInt();
        Rectangle rectangle = new Rectangle("зеленый", length, width);
        String colorRectangle = rectangle.getColor();
        System.out.println("\u001B[32m" + "Прямоугольник:" + colorRectangle);
        System.out.println("\u001B[32m" + "Периметр (P = 2 × (length + width) прямоугольника = " + rectangle.calculatePerimeter());
        System.out.println(" ");

        System.out.println("\u001B[0m" + "Пожаллуйста введите width, для нахождения периметра равностороннего треугольника по формуле (P = 3 × width ): ");
        double widthTriangle = scanner.nextInt();
        Triangle triangle = new Triangle("голубой", widthTriangle, 0);
        String colorTriangle = triangle.getColor();
        System.out.println("\u001B[36m" + "Треугольник:" + colorTriangle);
        System.out.println("\u001B[36m" + "Периметр (P = 3 × width ) треугольника = " + triangle.calculatePerimeter());
    }
}
