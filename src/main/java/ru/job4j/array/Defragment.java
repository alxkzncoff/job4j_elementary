package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int point = 0; point < array.length; point++) {
            if (array[point] == null) {
                for (int index = point + 1; index < array.length; index++) {
                    if (array[index] != null) {
                        array = SwitchArray.swap(array, point, index);
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}