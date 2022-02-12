package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1");

        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("     Установите версию приложения для iOS по ссылке");
        }
        if (clientOs == 1) {
            System.out.println("     Установите версию приложения для Android по ссылке");
        }

        System.out.println("Task 2");
        int clientOOs = 0;
        int clientDeviceYear = 2014;
        if (clientOOs == 0 && clientDeviceYear < 2015) {
            System.out.println("     Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("     Установите версию приложения для iOS по ссылке");
        }
        if (clientOOs == 1 && clientDeviceYear < 2015) {
            System.out.println("     Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("     Установите версию приложения для Android по ссылке");
        }

        System.out.println("Task 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)  {
            System.out.println("     Год високосный");
        } else {
            System.out.println("     Год невисокосный");
        }

        System.out.println("Task 4");
        short deliveryDistance = 95;
        short dayToClient = 1;
        if (deliveryDistance < 20 && deliveryDistance >= 0)  {
            System.out.println("     Потребуется дней " + dayToClient);
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60)  {
            System.out.println("     Потребуется дней " + dayToClient*2);
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100)  {
            System.out.println("     Потребуется дней " + dayToClient*3);
        }
        if (deliveryDistance <0) {
            System.out.println("     Ошибка расстояния до покупателя, обратитесь в службу поддержки ");
        }
        System.out.println("Task 5");
        short monthNumber = 13;
        short january = 1;
        short february = 2;
        short march = 3;
        short april = 4;
        short may = 5;
        short june = 6;
        short july = 7;
        short august = 8;
        short september = 9;
        short october = 10;
        short november = 11;
        short december = 12;
            switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("     Зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("     Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("     Лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("     Осень ");
                break;
                default:
                    System.out.println("     Ошибка ввода данных ");

        }
    }
}