package HW4;

import java.util.Scanner;

public class HW4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = in.nextInt();

        int maxDigit;
        maxDigit = (number % 10);
        while (number > 0) {
            int curDigit = (number % 10);
            if (curDigit > maxDigit)
                maxDigit = curDigit;
            number /= 10;
        }

        System.out.println("Max digit is " + maxDigit);
    }
}
