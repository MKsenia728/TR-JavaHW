package hw221019;

import java.util.Scanner;

public class Main {

    private void makeEspresso() {
        System.out.println("Делаем эспрессо");
    }
    private void makeAmericano() {
        this.makeEspresso();
        this.addIngredient(1);
    }
    private void makeCappuccino() {
        this.makeEspresso();
        this.addIngredient(2);
    }
    private void makeTea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите чай: 1 - зеленый; 2 - черный");
        int tea = scanner.nextInt();
        switch (tea) {
            case 1 :
                System.out.println("c мятой - 1; с ромашкой - 2");
                int addG = scanner.nextInt();
                switch (addG) {
                    case 1 -> System.out.println("Вы выбрали зеленый чай с мятой");
                    case 2 -> System.out.println("Вы выбрали зеленый чай с ромашкой");
                    default -> System.out.println("Вы не выбрали чай из возможных");
                }
                break;
            case 2:
                System.out.println("c бергамотом - 1; с лимоном - 2");
                int addB = scanner.nextInt();
                switch (addB) {
                    case 1 -> System.out.println("Вы выбрали черный чай с бергамотом");
                    case 2 -> System.out.println("Вы выбрали черный чай с лимоном");
                    default -> System.out.println("Вы не выбрали чай из возможных");
                }
                break;
            default:
                System.out.println("Вы не определились с чаем");
        }
        scanner.close();
        this.addIngredient(1);
    }
    private void addIngredient(int ingredient) {
        if (ingredient == 1)
            System.out.println("Добавляем воду");
        else System.out.println("Добавляем вспененное молоко");
    }

    private void makeDrink(int d) {
       switch (d) {
           case 1 -> this.makeEspresso();
           case 2 -> this.makeAmericano();
           case 3 -> this.makeCappuccino();
           case 4 -> this.makeTea();
           default -> System.out.println("Возьмите воду");
       }
    }

    public void chooseDrink() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите напиток:");
        System.out.println("Эспрессо - 1, Американо - 2, Капучино - 3, Чай - 4");
        int typeDrink = scanner.nextInt();
        this.makeDrink(typeDrink);
        System.out.println("Выбор десертов не реализован, пейте так!");
        scanner.close();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.chooseDrink();
    }
}
