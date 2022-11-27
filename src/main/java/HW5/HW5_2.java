package HW5;

import java.util.Scanner;

public class HW5_2 {
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

        int numberZero = 0;
        int numberOne = 0;

        for (int i = n+1; i <= m-1; i++) {
            int number = i;
            while (number > 0){
                int fig = number%10;
                if (fig == 0){
                    numberZero++;
                }
                if (fig == 1){
                    numberOne++;
                }
                number/=10;

            }
        }
        System.out.println("Zero digit = " + numberZero);
        System.out.println("One digit = " + numberOne);
    }
}
