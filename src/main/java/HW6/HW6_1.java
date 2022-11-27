package HW6;

import java.util.Scanner;

public class HW6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit for sequence Fib: ");
        int number = sc.nextInt();
        System.out.println("Enter search digit in seq Fib: ");
        int searchDigit = sc.nextInt();

        int n = 1;  // предыдущие число Ф
        int n2 = 1;  // Начало последовательности Ф

        for (int i = 2; i <= number; i++){
            n+=n2;
            n2=n-n2;
            System.out.println(n);
            if (searchDigit == n) {
                System.out.println("Digit search in seq Fibonacci: " + searchDigit);
            }
        }

        System.out.println(n);
    }
}
