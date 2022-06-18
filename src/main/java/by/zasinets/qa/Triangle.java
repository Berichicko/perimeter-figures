package by.zasinets.qa;

class Triangle extends Shape implements MathOperations {

    private final double WIDTH;
    private final double HEIGHT;

    public Triangle(String color, double WIDTH, double HEIGHT) {
        super(color);
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
    }

    @Override
    public double calculateArea() {
        return ((WIDTH * HEIGHT) / 2);
    }

    @Override
    double perimeter() {
        return (3 * WIDTH);
    }
}
