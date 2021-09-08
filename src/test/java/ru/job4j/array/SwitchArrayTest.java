package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to3() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 1;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 4, 3, 2, 5, 6};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to3String() {
        String[] input = {"a", "b", "c", "d"};
        int source = 0;
        int dest = input.length - 1;
        String[] result = SwitchArray.swap(input, source, dest);
        String[] expected = {"d", "b", "c", "a"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to3String() {
        String[] input = {"a", "b", "c", "d", "e", "f"};
        int source = 1;
        int dest = 3;
        String[] result = SwitchArray.swap(input, source, dest);
        String[] expected = {"a", "d", "c", "b", "e", "f"};
        Assert.assertArrayEquals(expected, result);
    }
}