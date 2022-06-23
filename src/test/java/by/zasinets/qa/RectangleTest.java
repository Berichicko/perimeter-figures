package by.zasinets.qa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {


    @Test
    public void calculateOneTestAreaResult() {
        Rectangle rectangleOne = new Rectangle("", 0,0);
        Assert.assertEquals(0, rectangleOne.calculateArea() ,0.1);
        System.out.println("Test 1 -Rectangle - Area- TEST SUCCESS ");

    }

    @Test
    public void calculateSecondTestAreaResult() {
        Rectangle rectangleSecond = new Rectangle("", 1,1);
        Assert.assertEquals(1, rectangleSecond.calculateArea() ,0.1);
        System.out.println("Test 2 -Rectangle - Area- TEST SUCCESS ");

    }
    @Test
    public void calculateThirdTestAreaResult() {
        Rectangle rectangleThird = new Rectangle("", 100,100);
        Assert.assertEquals(10000, rectangleThird.calculateArea() ,0.1);
        System.out.println("Test 3 -Rectangle - Area- TEST SUCCESS ");

    }

    @Test
    public void calculateFourTestAreaResult() {
        Rectangle rectangleFour = new Rectangle("", 101,101);
        Assert.assertEquals(10201, rectangleFour.calculateArea() ,0.1);
        System.out.println("Test 4 -Rectangle - Area- TEST SUCCESS ");

    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateFiveTestAreaResult() {
        Rectangle rectangleFive = new Rectangle("", -1,-100);
        Assert.assertEquals(rectangleFive.calculateArea() ,0.1);
        System.out.println("Test 5 -Rectangle - Area- TEST SUCCESS ");

    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateSixTestAreaResult() {
        Rectangle rectangleSix = new Rectangle("", -100,-100);
        Assert.assertEquals(rectangleSix.calculateArea() ,0.1);
        System.out.println("Test 6 -Rectangle - Area- TEST SUCCESS ");

    }

    @Test
    public void calculateEightTestPerimeter() {
        Rectangle rectangleEight = new Rectangle("",0,0);
        Assert.assertEquals(0,rectangleEight.calculatePerimeter(),0.1);
        System.out.println("Test 1 -Rectangle - Perimeter- TEST SUCCESS ");
    }

    @Test
    public void calculateNineTestPerimeter() {
        Rectangle rectangleNinePerimeter = new Rectangle("",1,1);
        Assert.assertEquals(4,rectangleNinePerimeter.calculatePerimeter(),0.1);
        System.out.println("Test 2 -Rectangle - Perimeter- TEST SUCCESS ");
    }

    @Test
    public void calculateTenTestPerimeter() {
        Rectangle rectangleTenPerimeter = new Rectangle("",100,100);
        Assert.assertEquals(400,rectangleTenPerimeter.calculatePerimeter(),0.1);
        System.out.println("Test 3 -Rectangle - Perimeter- TEST SUCCESS ");
    }

    @Test
    public void calculateElevenTestPerimeter() {
        Rectangle rectangleElevenPerimeter = new Rectangle("",101,101);
        Assert.assertEquals(404,rectangleElevenPerimeter.calculatePerimeter(),0.1);
        System.out.println("Test 4 -Rectangle - Perimeter- TEST SUCCESS ");
    }

    @Test (expected = IllegalArgumentException.class)
    public void calculateTwelveTestPerimeter() {
        Rectangle rectangleTwelvePerimeter = new Rectangle("",-1,-1);
        Assert.assertEquals(rectangleTwelvePerimeter.calculatePerimeter(),0.1);
        System.out.println("Test 5 -Rectangle - Perimeter- TEST SUCCESS ");
    }

    @Test (expected = IllegalArgumentException.class)
    public void calculateThirteenTestPerimeter() {
        Rectangle rectangleThirteenPerimeter = new Rectangle("",-100,100);
        Assert.assertEquals(rectangleThirteenPerimeter.calculatePerimeter(),0.1);
        System.out.println("Test 6 -Rectangle - Perimeter- TEST SUCCESS ");
    }
}
