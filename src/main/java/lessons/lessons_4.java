package lessons;

import java.util.Scanner;

public class lessons_4 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++ ){
//            for (int n = 1; n <= 10; n++){
//                int j;
//                j = i * n;
//                if (i < n) {
//                    System.out.println("Equals");
//                    break;
//                }
//                System.out.println(i + " * " + n + " = " + j);
//            }
//            System.out.println(String.format("%10s", "").replace(' ', '*'));
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n = sc.nextInt();
        System.out.println("Enter number 2: ");
        int m = sc.nextInt();

        if (!(m > n)){
            System.out.println("Error");
            return;
        }

//        int numberNine = 0;
//
//        for (int i = n; i <= m; i++) {
//            int number = i;
//            while (number > 0){
//                int fig = number%10;
//                if (fig == 9){
//                    numberNine ++;
//                }
//                number/=10;
//            }
//        }
//        System.out.println("nine number = " + numberNine);
//        System.out.println("Ok");

//        int maxSumFigure = 0;
//        int maxNumber = 0;
//        for (int i = n; i <= m; i++){
//            int number = i;
//            int sumFigure = 0;
//            while (number > 0){
//                int fig = number%10;
//                sumFigure += fig;
//                number /= 10;
//            }
//            if (sumFigure > maxSumFigure){
//                maxSumFigure = sumFigure;
//                maxNumber = i;
//            }
//        }
//        System.out.println(maxNumber);


//        for (int i = n; i <= m; i++) {
//            int x = i;
//            System.out.println("Для числа " + x);
//            while (x > 1) {
//                if (x%2 == 0){
//                    x = x/2;
//                    System.out.println(x + " четное");
//                } else {
//                    x = (x * 3 + 1) / 2;
//                    System.out.println(x + " нечетное");
//                }
//            }
//        }


    }
}
