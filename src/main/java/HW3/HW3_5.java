package HW3;

import java.util.Scanner;

public class HW3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();

        int maxDigit;
        maxDigit = number % 10;
        while (number > 0) {
            int curDigit = number % 10;
            if (curDigit > maxDigit)
                maxDigit = curDigit;
            number /= 10;
        }

        System.out.println("Max digit is " + maxDigit);
    }
}
