package ru.geekbrains.lesson_2;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords()
    {
        System.out.println("метод printThreeWords()");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    public static void checkSumSign()
    {
        System.out.println("метод checkSumSign()");
        int a=6,b=9;
        int c= a + b;
        if (c>=0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
        System.out.println();
    }

    public static void printColor()
    {
        System.out.println("метод printColor()");
        int value=5;
        if (value <=0) System.out.println("Красный");
        else if (value >0 && value<=100) System.out.println("Желтый");
        else System.out.println("Зеленый");
        System.out.println();
    }

    public static void  compareNumbers()
    {
        System.out.println("метод compareNumbers()");
        int a=6,b=2;
        if (a>=b)  System.out.println("a >= b");
        else System.out.println("a < b");
        System.out.println();
    }}

