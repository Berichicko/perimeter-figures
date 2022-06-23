package by.zasinets.qa;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void calculateOneTestAreaResult() {
        Triangle triangleOne = new Triangle("", 0,0);
        Assert.assertEquals(0, triangleOne.calculateArea() ,0.1);

    }

    @Test
    public void calculateSecondTestAreaResult() {
        Triangle triangleSecond = new Triangle("", 1,1);
        Assert.assertEquals(0.5, triangleSecond.calculateArea() ,0.1);

    }
    @Test
    public void calculateThirdTestAreaResult() {
        Triangle triangleThird = new Triangle("", 100,100);
        Assert.assertEquals(5000, triangleThird.calculateArea() ,0.1);

    }

    @Test
    public void calculateFourTestAreaResult() {
        Triangle triangleFour = new Triangle("", 101,101);
        Assert.assertEquals(5100.5, triangleFour.calculateArea() ,0.1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateFiveTestAreaResult() {
        Triangle triangleFive = new Triangle("", -1,-100);
        Assert.assertEquals(triangleFive.calculateArea() ,0.1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateSixTestAreaResult() {
        Triangle triangleSix = new Triangle("", -100,-100);
        Assert.assertEquals(triangleSix.calculateArea() ,0.1);

    }

    @Test
    public void calculateEightTestPerimeter() {
        Triangle triangleEight = new Triangle("",0,0);
        Assert.assertEquals(0,triangleEight.calculatePerimeter(),0.1);
    }

    @Test
    public void calculateNineTestPerimeter() {
        Triangle triangleNinePerimeter = new Triangle("",1,1);
        Assert.assertEquals(3,triangleNinePerimeter.calculatePerimeter(),0.1);
    }

    @Test
    public void calculateTenTestPerimeter() {
        Triangle triangleTenPerimeter = new Triangle("",100,100);
        Assert.assertEquals(300,triangleTenPerimeter.calculatePerimeter(),0.1);
    }

    @Test
    public void calculateElevenTestPerimeter() {
        Triangle triangleElevenPerimeter = new Triangle("",101,101);
        Assert.assertEquals(303,triangleElevenPerimeter.calculatePerimeter(),0.1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void calculateTwelveTestPerimeter() {
        Triangle triangleTwelvePerimeter = new Triangle("",-1,-1);
        Assert.assertEquals(triangleTwelvePerimeter.calculatePerimeter(),0.1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void calculateThirteenTestPerimeter() {
        Triangle triangleThirteenPerimeter = new Triangle("",-100,100);
        Assert.assertEquals(triangleThirteenPerimeter.calculatePerimeter(),0.1);
    }
}
