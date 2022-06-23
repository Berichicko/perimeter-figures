package by.zasinets.qa;

class Circle extends Shape implements Mathable {

    private final double RADIUS;

    public Circle(String color, double RADIUS) {
        super(color);
        this.RADIUS = RADIUS;
    }


    @Override
    public double calculateArea() {
        if ((0 > this.RADIUS) ) {
            throw new IllegalArgumentException();
        }
        double resultAreaCircle = (Math.PI * (RADIUS * RADIUS));
        return resultAreaCircle;
    }

    @Override
    double calculatePerimeter() {
        if ((0 > this.RADIUS) ) {
            throw new IllegalArgumentException();
        }
        double resultPerimeterCircle = (2 * Math.PI * RADIUS);
        return resultPerimeterCircle;
    }

}
