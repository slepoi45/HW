package HW5;

import java.util.Scanner;

public class HW5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit square: ");
        int number = sc.nextInt();
        String str = String.format("%4s", "");
        for (int i = 0; i <= 0; i++) {
            double squadNumber = Math.sqrt(number);
            System.out.println(number);
            System.out.println("|");
            System.out.println(squadNumber + "*" + squadNumber);
        }
    }
}
