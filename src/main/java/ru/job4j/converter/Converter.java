package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float euro = Converter.rubleToEuro(in);
        boolean passedEuro = expected == euro;
        System.out.println("140 rubles are 2 euro. Test result: " + passedEuro);
        in = 180;
        expected = 3;
        float dollar = Converter.rubleToDollar(in);
        boolean passedDollar = expected == dollar;
        System.out.println(("180 rubles are 3 dollars. Test result: " + passedDollar));
    }
}