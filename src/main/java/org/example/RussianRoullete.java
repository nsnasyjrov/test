package org.example;

import java.util.Random;
import java.util.Scanner;

public class RussianRoullete {
    public static void main(String[] args) {
        russianRoullete();
    }

    public static void russianRoullete() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int bullet = rand.nextInt(7);

        System.out.print("Выберите число до 6: ");
        int num = scan.nextInt();
        if (num == bullet) {
            System.out.println("Поздравляю, вы умерли!");
        }
    }

}
