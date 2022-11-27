package HW4;

import java.util.Scanner;

public class HW4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = sc.nextInt();

        int maxSumFigure = 0;
        int maxNumber = 0;
        for (int i = number1; i <= number2; i++){
            int number = i;
            int sumFigure = 0;
            while (number > 0){
                int fig = number%10;
                sumFigure += fig;
                number /= 10;
            }
            if (sumFigure > maxSumFigure){
                maxSumFigure = sumFigure;
                maxNumber = i;
            }
        }
        System.out.println(maxNumber);
    }
}
