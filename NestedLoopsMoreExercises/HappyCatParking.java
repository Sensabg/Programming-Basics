package NestedLoopsMoreExercises;

import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double totalPrice = 0;
        double dailyPrice = 0;

        for (int i = 1; i <= days; i++) {
            dailyPrice = 0;
            for (int j = 1; j <= hours; j++) {

                if (i % 2 == 0 && j % 2 != 0) {
                    price = 2.50;
                    dailyPrice+=price;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    price=1.25;
                    dailyPrice+=price;
                } else {
                    price=1;
                    dailyPrice+=price;
                }


                totalPrice += price;

            }
            System.out.printf("Day: %d - %.2f leva\n",i,dailyPrice);
        }
        System.out.printf("Total: %.2f leva\n",totalPrice);
    }
}
