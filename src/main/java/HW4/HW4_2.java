package HW4;

import java.util.Scanner;

public class HW4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        int sum = 0;
        while(number != 0){
            sum += (number%10);
            number/=10;
        }
        System.out.println(sum + " ");
    }
}
