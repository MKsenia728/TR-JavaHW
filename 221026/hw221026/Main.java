package hw221026;

public class Main {

    public static int counterFor(int numberOfFloors, int floorUp, int floorDown) {
        int counter = 0;
        for (int i = 0; i <= numberOfFloors - floorDown; i = i - floorDown) {
            counter++;
            i = i + floorUp;
        }
        return counter;
    }

    public static int counterWhile(int numberOfFloors, int floorUp, int floorDown) {
        int counter = 0;
        int i = 0;
        while (i <= numberOfFloors - floorDown) {
            i = i + floorUp - floorDown;
            counter++;
        }
        return counter;
    }

    public static int counterDoWhile(int numberOfFloors, int floorUp, int floorDown) {
        int counter = 0;
        if (numberOfFloors > 0) {
            int i = 0;
            do {
                i = i + floorUp - floorDown;
                counter++;
            } while (i <= numberOfFloors - floorDown);
        }
        return counter;
    }

    public static void main(String[] args) {

        int numberOfFloors = 164;
        int floorUp = 7;
        int floorDown = 2;

        System.out.println("Количество подъемов по FOR : " + counterFor(numberOfFloors,floorUp,floorDown));
        System.out.println("Количество подъемов по WHILE : " + counterWhile(numberOfFloors,floorUp,floorDown));
        System.out.println("Количество подъемов по DO-WHILE : " + counterDoWhile(numberOfFloors,floorUp,floorDown));
    }
}
