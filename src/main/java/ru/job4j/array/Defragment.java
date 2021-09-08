package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int nullIndex = 0; nullIndex < array.length; nullIndex++) {
            if (array[nullIndex] == null) { /* ищем ячейку с null значением */
                for (int notNullIndex = nullIndex + 1; notNullIndex < array.length; notNullIndex++) {
                    if (array[notNullIndex] != null) { /* ищем ячейку без null значения */
                        array = SwitchArray.swap(array, nullIndex, notNullIndex);
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