package by.zasinets.qa;


import org.junit.Assert;
import org.junit.Test;

public class CircleTestArea {


    @Test(timeout=1000)
    public void calculateOneTestAreaResult() {
        Circle circleOne = new Circle("", 0);
        Assert.assertEquals(0, circleOne.calculateArea(), 0.1);
        System.out.println("Test 1-  Circle - Area -TEST SUCCESS ");

    }

    @Test(timeout=2000)
    public void calculateSecondTestAreaResult() {
        Circle circleSecond = new Circle("", 1);
        Assert.assertEquals(3.14, circleSecond.calculateArea(), 0.1);
        System.out.println("Test 2-  Circle - Area -TEST SUCCESS ");

    }

    @Test
    public void calculateThirdTestAreaResult() {
        Circle circleThird = new Circle("", 100);
        Assert.assertEquals(31415.9, circleThird.calculateArea(), 0.1);
        System.out.println("Test 3-  Circle - Area -TEST SUCCESS ");

    }

    @Test(timeout=5000)
    public void calculateFourTestAreaResult() {
        Circle circleFour = new Circle("", 101);
        Assert.assertEquals(32047.3, circleFour.calculateArea(), 0.1);
        System.out.println("Test 4-  Circle - Area -TEST SUCCESS ");

    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateFiveTestAreaResult() {
        Circle circleFive = new Circle("", -1);
        Assert.assertEquals(circleFive.calculateArea(), 0.1);
        System.out.println("Test 5-  Circle - Area -TEST SUCCESS ");

    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateSixTestAreaResult() {
        Circle circleSix = new Circle("", -100);
        Assert.assertEquals(circleSix.calculateArea(), 0.1);
        System.out.println("Test 6-  Circle - Area -TEST SUCCESS ");
    }
}
