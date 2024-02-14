package ru.stqa.jft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {
    @Test
    public void testDistance1(){
        Point p = new Point(5, 6);
        Assert.assertEquals(p.distance(), 7.810249675906654);
    }

    @Test
    public void testDistance2(){
        Point p = new Point(-2, 3);
        Assert.assertEquals(p.distance(), 3.605551275463989);
    }
}
