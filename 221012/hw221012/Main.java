package hw221012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int secToWorkEnd;

        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        System.out.print("Введите текущее время в формате hh:mm:ss : ");
        String curTime = scanner.nextLine();
        scanner.close();

        secToWorkEnd = timer.counterSecToWorkEnd(curTime);
        if (secToWorkEnd >= 0) {
            System.out.println("До конца рабочего дня осталось : " + secToWorkEnd + " секунд или " + secToWorkEnd / 60 + " минут или " + secToWorkEnd / 60 / 60 + " часа(ов) ");
            System.out.println("Всего до конца рабочего дня осталось " + secToWorkEnd / 60 / 60 + " часов " + secToWorkEnd / 60 % 60 + " минут " + secToWorkEnd % 60 + " секунд");
        }
    }
}
