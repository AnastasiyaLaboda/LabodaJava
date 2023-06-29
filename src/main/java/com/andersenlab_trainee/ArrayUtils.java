package com.andersenlab_trainee;

import java.util.Random;

public class ArrayUtils {
    private static final int DIVISOR = 3;

    public static void fillArrayWithRandomNumbersAndPrint(int[] array) {
        Random random = new Random();
        System.out.print("numeric array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printDivisibleArrayElements(int[] array) {
        System.out.print("matched elements: ");
        for (int num : array) {
            if (num % DIVISOR == 0 && num != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
