package hw221024;

import java.util.Scanner;

public class Main {

    static int sumAllNumber(int n) {
        int sum = 0;
        for (int i = n; i > 0 ; i--) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean rightNumber = false;
        int number = 0;
        while (!rightNumber) {
            System.out.print("Введите целое положительное число : ");
            number = scanner.nextInt();
            rightNumber = (number > 0);
        }

        scanner.close();
        System.out.println("Сумма всех числел от 0 до " + number + " равна " + sumAllNumber(number));
    }
}
