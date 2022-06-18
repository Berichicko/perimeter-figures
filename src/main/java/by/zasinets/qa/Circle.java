package by.zasinets.qa;

class Circle extends Shape implements MathOperations {

    private final double RADIUS;

    public Circle(String color, double RADIUS) {
        super(color);
        this.RADIUS = RADIUS;
    }

    @Override
    public double calculateArea() {
        return (Math.PI * (RADIUS * RADIUS));
    }

    @Override
    double perimeter() {
       return (2 * Math.PI * RADIUS);
    }
}
