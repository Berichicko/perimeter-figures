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
        if ((this.HEIGHT <0 || this.WIDTH<0) ) {
            throw new IllegalArgumentException();
        }
        double resultAreaTriangle =((WIDTH * HEIGHT) / 2);
        return resultAreaTriangle;
    }

    @Override
    double calculatePerimeter() {
        if ((this.HEIGHT <0 || this.WIDTH<0) ) {
            throw new IllegalArgumentException();
        }
        double resultPerimeterTriangle = (3 * WIDTH);
        return resultPerimeterTriangle;
    }
}
