package by.zasinets.qa;

class Triangle extends Shape implements Mathable {

    private final double WIDTH;
    private final double HEIGHT;

    public Triangle(String color, double WIDTH, double HEIGHT) {
        super(color);
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
    }

    @Override
    public double calculateArea() {
        double resultAreaTriangle =((WIDTH * HEIGHT) / 2);
        return resultAreaTriangle;
    }

    @Override
    double calculatePerimeter() {
        double resultPerimeterTriangle = (3 * WIDTH);
        return resultPerimeterTriangle;
    }
}
