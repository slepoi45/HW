package HW6;

import java.util.Scanner;

public class HW6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n = sc.nextInt();
        System.out.println("Enter number 2: ");
        int m = sc.nextInt();

        if (!(m > n)){
            System.out.println("Error");
            return;
        }

        for (int i = n; i <= m; i++) {
            int num = i;
            boolean contains9 = false;
            while (num != 0) {
                if (num % 10 == 9) {
                    contains9 = true;
                    break;
                }
                num /= 10;
            }
            if (!contains9) System.out.println(i);
        }
    }
}
