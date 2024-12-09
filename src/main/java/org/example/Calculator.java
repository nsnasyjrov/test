package org.example;

import java.util.Scanner;

public class Calculator {
    public static int calculate() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int num1 = scan.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = scan.nextInt();
            System.out.print("Выберите операцию(+-/*) : ");
            scan.nextLine();
            String input = scan.nextLine();
            switch (input) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    return num1 / num2;
                default:
                    System.out.println("Вы ввели неверные значения!");
            }
        } catch (Exception e) {
            System.out.println("Сорри, либо ты чета неправильно ввел, либо программист хуесос");
        }

        System.out.println("Работа программы завершена!");
        return 0;
    }
}
