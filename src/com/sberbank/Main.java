package com.sberbank;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }

//        Или цикл можно заменить на это:
//        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        fibonacci(20);

    }

    /**
     * Метод для генерации последовательности Фибоначчи
     *
     * @param n - число элементов последовательности
     */
    public static void fibonacci(int n) {
        long prevision = 0;
        long next = 1;
        if (n > 0) {
            System.out.print(prevision + " ");
            for (int i = 0; i < n; i++) {
                long temp = next;
                next = prevision + next;
                prevision = temp;
                System.out.print(prevision + " ");
            }
        } else {
            System.out.println("Не корректное число для генерации полседовательности Фибаначчи");
        }
    }

}