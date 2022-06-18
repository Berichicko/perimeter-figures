package by.zasinets.qa;

class Rectangle extends Shape implements MathOperations {

    private final double LENGTH;
    private final double WIDTH;

    public Rectangle(String color, double LENGTH, double WIDTH) {
        super(color);
        this.LENGTH = LENGTH;
        this.WIDTH = WIDTH;
    }

    @Override
    public double calculateArea() {
        return (LENGTH * WIDTH);
    }

    @Override
    double perimeter() {
        return ((LENGTH + WIDTH) * 2);
    }
}
