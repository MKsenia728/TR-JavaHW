package hw10102022;

public class MathOperations {

    public void sum(double x, double y) {
        System.out.println("Сумма чисел " + x + " и " + y + " равна " + (x + y));
    }

    public void diff(double x, double y) {
        System.out.println("Разница чисел " + x + " и " + y + " равна " + (x - y));
    }

    public void mul(double x, double y) {
        System.out.println("Произведение чисел " + x + " и " + y + " равно " + (x * y));

    }
    public void div(double x, double y) {
        if (y != 0) {
            System.out.println("Частное чисел " + x + " и " + y + " равно " + (x / y));
        } else System.out.println("Делить на ноль нельзя");
    }
}
