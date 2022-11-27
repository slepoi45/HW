package HW6;

import java.util.Scanner;

public class HW6_3 {
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
            int count = 0;
            while (num > 0) {
                if (num % 10 == 2) {
                    count++;
                }
                num /= 10;
            }
            System.out.println(num);
//            Нифига тут не работает
        }
    }
}
