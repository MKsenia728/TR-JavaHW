package org.example;

public class Main {
    
    public static int counterNum(int number) { // считает количество разрядов
        int counter = 0;
        if (number > 0) {
            while (number > 0) {
                number = number / 10;
                counter ++;
            }
        }
        return counter;
    }

    public static int takeDigit(int number, int digit) { // вычисляет цифру конкретного разряда
        int digitNum = number / (int)Math.pow(10,digit);
        return digitNum;
    }

    public static int convertTo10(int number,int scale) { // конвертирует в десятичную
        int convertNumber = 0;
        int count = counterNum(number);
        while (count > 0) {
            count --;
            convertNumber = convertNumber + takeDigit(number,count) * (int)Math.pow(scale,count);
            number = number % (int)Math.pow(10,count);
        }
        return convertNumber;
    }

    public static int convertFrom10(int number,int scale) { // конвертирует из десятичной
        int counter = 0;
        int convertNumber = 0;
        while (number > 0) {
            convertNumber = convertNumber + number % scale * (int)Math.pow(10,counter);
            number = number / scale;
            counter++;
        }
        return convertNumber;
    }

    public static void main(String[] args) {
        int numberTask0 = 478;
        int numberTask1 = 200345;
        int numberTask2 = 632;
        int numberTask3 = 637;
        int numberTask4 = 11100111;
        int numberTask5 = 637;

        int count = 0;

        System.out.println("0. Перевести число 478 из шестнадцатеричной в десятичную");
        System.out.println("Перевод шестнадцатиричного числа " + numberTask0 + " в десятичное равно: " + convertTo10(numberTask0,16) + "\n");


        System.out.println("1.Разложить число 200345 на разряды в десятичной системе");
        count = counterNum(numberTask1);
        System.out.println("В числе " + numberTask1 + " такие разряды");
        while (count > 0) {
            count--;
            System.out.println("В разряде " + (count + 1) + " : " + takeDigit(numberTask1,count));
            numberTask1 = numberTask1 % (int)Math.pow(10,count);
        }


        System.out.println("2.Перевести (637) 632 из десятичной в шестнадцатеричную и обратно (10->16 и 16->10)");
        numberTask2 = convertFrom10(numberTask2,16);
        System.out.println("В шестнадцатиричной: " + numberTask2);
        System.out.println("В десятичной: " + convertTo10(numberTask2,16) + "\n");


        System.out.println("3.Перевести 637 из десятичной в двоичную");
        System.out.println("Десятичное число " + numberTask3 + " в двоичной системе равно : " + convertFrom10(numberTask3,2) + "\n");


        System.out.println("4.11100111 перевести в десятичную систему");
        System.out.println("Перевод шестнадцатиричного числа " + numberTask4 + " в десятичное равно: " + convertTo10(numberTask4,2) + "\n");

        
        System.out.println("5.Перевести 637 из десятичной в троичную систему");
        System.out.println("Десятичное число " + numberTask5 + " в троичной системе равно : " + convertFrom10(numberTask5,3) + "\n");
    }
}