package HW4;

import java.util.Scanner;

public class HW4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = sc.nextInt();

        for (; number1 < number2; number1++){
            if (number1%3 == 0 && number1%5 == 0){
                System.out.println("Fizz Buzz");
            } else if (number1%3 == 0) {
                System.out.println("Fizz");
            } else if (number1%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("None");
            }
        }
    }
}
