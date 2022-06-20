package by.zasinets.qa;

class Circle extends Shape implements Mathable {

    private final double RADIUS;

    public Circle(String color, double RADIUS) {
        super(color);
        this.RADIUS = RADIUS;
    }


    @Override
    public double calculateArea() {
        double resultAreaCircle = (Math.PI * (RADIUS * RADIUS));
        return resultAreaCircle;
    }

    @Override
    double calculatePerimeter() {
        double resultPerimeterCircle = (2 * Math.PI * RADIUS);
        return resultPerimeterCircle;
    }
}
