package hw221017;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean canWalk;

        System.out.print("Is today a weekend? (true / false) : ");
        boolean isWeekend = scanner.nextBoolean();
        System.out.print("Is today raining? (true / false) : ");
        boolean isRain = scanner.nextBoolean();

        canWalk = isWeekend && !isRain;

        if (canWalk) {
            System.out.println("We can go to walk");
        } else System.out.println("We can not go to walk");
    }
}
