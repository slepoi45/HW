package lessons;

import java.util.Scanner;

public class lessons_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n = sc.nextInt();
        System.out.println("Enter number 2: ");
        int m = sc.nextInt();

//        System.out.println("Please enter number: ");
//        long number = sc.nextLong();
//
//        int count = 0;
//
//        for (; number > 0; number/=10 ) {
//            if (number%10 == 5){
//                count++;
//            }
//        }
//        System.out.println("Кол-во 5: " + count);

//        int x = sc.nextInt();
//        int count = 0;
//        while (x%2 == 0){
//            x/=2;
//            count++;
//        }
//        System.out.println("Степень 2 - " + count);

//        int x = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= x; i++){
//            if (i%2==0){
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

//        int number = sc.nextInt();
//        int sum = 0;
//
//        while(number>0){
//            sum+=number%10;
//            number/=10;
//        }

//        for (; number > 0; number/=10){
//            sum+=number%10;
//        }
//        System.out.println(sum);

//        int number = sc.nextInt();
//
//        int n = 1;  // предыдущие число Ф
//        int n2 = 1;  // Начало последовательности Ф
//
//        for (int i = 2; i <= number; i++){
//            n+=n2;
//            n2=n-n2;
//            System.out.println(n);
//        }
//
//        System.out.println(n);

        if (!(m > n)){
            System.out.println("Error");
            return;
        }

//        for (int i = n; i <= m; i++) {
//            int x = i;
//            int sum = 0;
//            while (x > 1){
//                int fig = x%10;
//                sum += fig;
//                x/=10;
//                if (sum < 5) System.out.println(sum);
//            }
//        }
        for (int i = n; i <= m; i++) {
            int x = i;
            int zero = 0;
            for (; x>0; x/=10){
                if (x%10 == 0){
                    zero++;
                }
            }
            if (zero > 2){
                System.out.println(x);
            }
        }
    }
}
