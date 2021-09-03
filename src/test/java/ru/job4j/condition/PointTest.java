package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when11To10Then1() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 0;
        double expected = 1.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus10To10Then2() {
        int x1 = -1;
        int y1 = 0;
        int x2 = 1;
        int y2 = 0;
        double expected = 2.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42ToMinus9Minus1Then1334() {
        int x1 = 4;
        int y1 = 2;
        int x2 = -9;
        int y2 = -1;
        double expected = 13.34;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}