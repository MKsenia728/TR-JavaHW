package hw10102022;


import java.util.Scanner;

public class Main {

    public static double convertCurrency(double sum, double rate) {
        return sum / rate;
    }

    public static void main(String[] args) {

        MathOperations math = new MathOperations();
        Scanner scanner = new Scanner(System.in);

//        задание 1
        System.out.print("Введите слово с четным количеством букв: ");
        String testWord = scanner.nextLine();
        if ((testWord.length() % 2) > 0) {
            System.out.println("В введном слове нечетное количество букв");
        } else {
            System.out.println("В слове \"" + testWord + "\" " + testWord.length() + " букв");
            System.out.println("Первая половина слова : \"" + testWord.substring(0,testWord.length() / 2) + "\"");
            System.out.println("Вторая половина слова : \"" + testWord.substring(testWord.length() / 2) + "\"");
        }

//        Задание 2
        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите число y: ");
        double y = scanner.nextDouble();
        scanner.nextLine();
        math.sum(x,y);
        math.diff(x,y);
        math.mul(x,y);
        math.div(x,y);

//        Задание 3
        System.out.print("Введите сумму в евро: ");
        double sum = scanner.nextDouble();
        System.out.print("Введите курс к доллару: ");
        double rate = scanner.nextDouble();
        scanner.nextLine();
        if (rate != 0) {
            System.out.println(sum + " евро в долларе составляет: " + convertCurrency(sum,rate));
        } else System.out.println("Курс не может быть равен 0");
    }
}
