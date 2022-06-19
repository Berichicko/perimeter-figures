package by.zasinets.qa;

abstract class Shape {

    private final String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract double calculatePerimeter();

}
