package hw221026;

public class Main {

    public static int counterForSimple(int numberOfFloors) {
        int counter = 0;
        for (int i = 0; i < numberOfFloors; i = i + 5 - 1) {
            counter++;
        }
        return counter;
    }

    public static int counterForHeavy(int numberOfFloors) {
        int counter = 1;
        int j = 0;
        for (int i = 0; i <= numberOfFloors; i++, j++) {
            if (j > 0 && j % 5 == 0) {
                counter++;
                i--;
            }
        }
        return counter;
    }

    public static int counterWhile(int numberOfFloors) {
        int counter = 0;
        int i = 0;
        while (i < numberOfFloors) {
            i = i + 5 - 1;
            counter++;
        }
        return counter;
    }

    public static int counterDoWhile(int numberOfFloors) {
        int counter = 0;
        int i = 0;
        do {
            i = i + 5 - 1;
            counter++;
        } while (i < numberOfFloors);
        return counter;
    }

    public static void main(String[] args) {

        int numberOfFloors = 163;

        if (numberOfFloors > 0) {
            System.out.println("Количество подъемов по FOR : " + counterForSimple(numberOfFloors));
            System.out.println("Количество подъемов по FOR (heavy): " + counterForHeavy(numberOfFloors));
            System.out.println("Количество подъемов по WHILE : " + counterWhile(numberOfFloors));
            System.out.println("Количество подъемов по DO-WHILE : " + counterDoWhile(numberOfFloors));
        }
    }
}
