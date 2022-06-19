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
        double resultAreaRectangle =  (LENGTH * WIDTH);
        return resultAreaRectangle;
    }

    @Override
    double calculatePerimeter() {
        double resultPerimeterRectangle = ((LENGTH + WIDTH) * 2);
        return resultPerimeterRectangle;
    }
}
