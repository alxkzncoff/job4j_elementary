package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int change = money - price;
        int size = 0;
        for (int index = 0; index < 4; index++) {
            while ((change > 0) && (change >= coins[index])) {
                if (change - coins[index] >= 0) {
                    change -= coins[index];
                    rsl[size] = coins[index];
                    size += 1;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
