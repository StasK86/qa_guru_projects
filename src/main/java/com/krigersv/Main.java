package com.krigersv;

public class Main {
    public static void main(String[] args) {

        // Приметивные типы данных
        boolean typeBoolean; //true/false

        // Целочисленные типы данных
        byte typeByte; // от -128 до 127, занимает 1 байт.
        short typeShort; //от -32 768 до 32 767, занимает 2 байта.
        int typeInt; //от -2147483648 до 2147483647, 32 занимает 4 байта.
        long typeLong; // от-9223372036854775808L до 9223372036854775807L, занимает 8 байт.

        // Типы данных с плавающей точкой
        float typeFloat; // 4.5343f
        double typeDouble; //8.43434

        // Тип данных для хранения символов
        char typeChar; // '&';

        // Упражнение с математическими и логическими операторами
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("b--   = " + (a--));
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));

        // арифметические
        System.out.println(1 + 4);
        System.out.println(4 - 1);
        System.out.println(5 * 5);
        System.out.println(10 / 2);
        System.out.println(a % b);

        // сравнения
        int e = 10;
        int f = 20;
        System.out.println("e == f = " + (e == f));
        System.out.println("e != f = " + (e != f));
        System.out.println("e > f = " + (e > f));
        System.out.println("e < f = " + (e < f));
        System.out.println("e >= f = " + (e >= f));
        System.out.println("e <= f = " + (e <= f));

        // логические

        if (a > b && c < d) {
            System.out.println("Верно");
        } else {
            System.out.println("Не верно");
        }

        if (d > a || c < b) {
            System.out.println("Верно");
        } else {
            System.out.println("Не верно");
        }

        // переполнение при вычислениях

        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue + 1 : " + (maxValue + 1));

        //  вычисления комбинаций типов данных (int и double)
        int g = 65;
        double h = 10.0;
        double i = 15.4;
        System.out.println(g + i);
        System.out.println(g - i);
        System.out.println(g * i);
        System.out.println(g / i);
        System.out.println(h * i);

        if (i != 15.4) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}