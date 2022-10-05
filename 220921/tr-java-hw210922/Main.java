package org.example;

public class Main {
    public static void main(String[] args) {

        String[] arrTypeData = {"char","integer","byte","short","float","double","long"};

        char varChar = 'G';
        int varInteger = 89;
        byte varByte = 4;
        short varShort = 56;
        float varFloat = 4.7333436f;
        double varDouble = 4.355453532;
        long varLong = 12121l;

        int number3 = 0;

        System.out.println(arrTypeData[0] + ": " + varChar);
        System.out.println(arrTypeData[1] + ": " + varInteger);
        System.out.println(arrTypeData[2] + ": " + varByte);
        System.out.println(arrTypeData[3] + ": " + varShort);
        System.out.println(arrTypeData[4] + ": " + varFloat);
        System.out.println(arrTypeData[5] + ": " + varDouble);
        System.out.println(arrTypeData[6] + ": " + varLong);

        if ((number3 / 1000 == 0) && (number3 / 100 != 0)) {
            System.out.print("В числе " + number3);
            if (number3 < 0) number3 = Math.abs(number3);
            System.out.println(" единицы: " + number3 % 10 + " десятки: " + number3 / 10 % 10 + " сотни: " + number3 / 100);
        } else System.out.println("Число " + number3 + " не трехзначное");

    }
}