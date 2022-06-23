package by.zasinets.qa;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CircleTestPerimeter {

    @Test
    public void calculateOneTestPerimeter() {
        Circle circleOnePerimeter = new Circle("",0);
        Assert.assertEquals(0,circleOnePerimeter.calculatePerimeter(),0.1);
        System.out.println("Test 1 - Circle - Perimeter- TEST SUCCESS ");
    }

    @Test(timeout=1000)
    public void calculateSecondTestPerimeter() {
        Circle circleSecondPerimeter = new Circle("",1);
        Assert.assertEquals(6.2,circleSecondPerimeter.calculatePerimeter(),0.1);
        System.out.println("Test 2 - Circle - Perimeter- TEST SUCCESS ");
    }

    @Test
    public void calculateThirdTestPerimeter() {
        Circle circleThirdPerimeter = new Circle("",100);
        Assert.assertEquals(628.3,circleThirdPerimeter.calculatePerimeter(),0.1);
        System.out.println("Test 3 - Circle - Perimeter- TEST SUCCESS ");
    }

    @Test(timeout=6000)
    public void calculateFourTestPerimeter() {
        Circle circleFourPerimeter = new Circle("",101);
        Assert.assertEquals(634.6,circleFourPerimeter.calculatePerimeter(),0.1);
        System.out.println("Test 4 - Circle - Perimeter- TEST SUCCESS ");
    }
    @Ignore
    @Test (expected = IllegalArgumentException.class)
    public void calculateFiveTestPerimeter() throws InterruptedException {
        Thread.sleep(5000);
        Circle circleFivePerimeter = new Circle("",-1);
        Assert.assertEquals(circleFivePerimeter.calculatePerimeter(),0.1);
        System.out.println("Test 5 - Circle - Perimeter- TEST SUCCESS ");
    }

    @Ignore
    @Test (expected = IllegalArgumentException.class)
    public void calculateSixTestPerimeter() {
        Circle circleSixPerimeter = new Circle("",-100);
        Assert.assertEquals(circleSixPerimeter.calculatePerimeter(),0.1);
        System.out.println("Test 6 - Circle - Perimeter- TEST SUCCESS ");
    }
  }
