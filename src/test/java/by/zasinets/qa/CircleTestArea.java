package by.zasinets.qa;


import org.junit.Assert;
import org.junit.Test;

public class CircleTestArea {


    @Test
    public void calculateOneTestAreaResult() {
        Circle circleOne = new Circle("", 0);
        Assert.assertEquals(0, circleOne.calculateArea(), 0.1);

    }

    @Test
    public void calculateSecondTestAreaResult() {
        Circle circleSecond = new Circle("", 1);
        Assert.assertEquals(3.14, circleSecond.calculateArea(), 0.1);

    }

    @Test
    public void calculateThirdTestAreaResult() {
        Circle circleThird = new Circle("", 100);
        Assert.assertEquals(30790.7, circleThird.calculateArea(), 0.1);

    }

    @Test
    public void calculateFourTestAreaResult() {
        Circle circleFour = new Circle("", 101);
        Assert.assertEquals(32047.3, circleFour.calculateArea(), 0.1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateFiveTestAreaResult() {
        Circle circleFive = new Circle("", -1);
        Assert.assertEquals(circleFive.calculateArea(), 0.1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateSixTestAreaResult() {
        Circle circleSix = new Circle("", -100);
        Assert.assertEquals(circleSix.calculateArea(), 0.1);
    }
}
