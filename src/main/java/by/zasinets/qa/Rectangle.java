package by.zasinets.qa;

class Rectangle extends Shape implements Mathable {

    private final double LENGTH;
    private final double WIDTH;

    public Rectangle(String color, double LENGTH, double WIDTH) {
        super(color);
        this.LENGTH = LENGTH;
        this.WIDTH = WIDTH;
    }


    @Override
    public double calculateArea() {
        if ((this.LENGTH < 0 || this.WIDTH < 0)) {
            throw new IllegalArgumentException();
        }
        double resultAreaRectangle = (LENGTH * WIDTH);
        return resultAreaRectangle;
    }

    @Override
    double calculatePerimeter() {
        if ((this.LENGTH < 0 || this.WIDTH < 0)) {
            throw new IllegalArgumentException();
        }
        double resultPerimeterRectangle = ((LENGTH + WIDTH) * 2);
        return resultPerimeterRectangle;
    }
}
