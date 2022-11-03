package hw221102;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int countElem = 15;

        countOfEven(generateArray(countElem));
    }

    public static int[] generateArray(int countElem) {
        int[] arr = new int[countElem];
        Random r = new Random(2);

        for (int i = 0; i < countElem; i++) {
            arr[i] = r.nextInt(10);
        }
        System.out.println("Массив сгенерирован : " + Arrays.toString(arr));
        return arr;
    }
    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static void countOfEven(int[] arr) {
        int count = 0;
        for (int e : arr) if (isEven(e)) count++;
        System.out.println("В массиве " + count + " четных элементов");
    }
}
