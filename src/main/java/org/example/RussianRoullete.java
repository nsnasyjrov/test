package org.example;

import java.util.Scanner;

public class RussianRoullete {
    public static void main(String[] args) {
        russianRoullete();
    }

    public static void russianRoullete() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Выберите число: ");
        int num = scan.nextInt();
        if (num == 5) {
            System.out.println("Вы умерли");
        }
    }
}
