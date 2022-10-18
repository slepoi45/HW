package lessons;

import java.util.Scanner;

public class lessons_2 {
    public static void main(String[] args) {


        //        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        while (count != 10) {
//            System.out.println("Enter number: ");
//            int i = sc.nextInt();
//            switch (i){
//                case 1:
//                    System.out.println("Пн");
//                    break;
//                case 2:
//                    System.out.println("Вт");
//                    break;
//                case 3:
//                    System.out.println("Ср");
//                    break;
//                case 4:
//                    System.out.println("Чт");
//                    break;
//                case 5:
//                    System.out.println("Пт");
//                    break;
//                case 6:
//                    System.out.println("Сб");
//                    break;
//                case 7:
//                    System.out.println("Вс");
//                    break;
//                default:
//                    System.out.println("Bad day");
//            }
//            count = i;
//            if (count == 10) {
//                break;
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        while (count != 10) {
//            System.out.println("Enter x value: ");
//            int x = sc.nextInt();
//            System.out.println("Enter y value: ");
//            int y = sc.nextInt();
//
//            if(x > 0 & y > 0){
//                System.out.println("Value one part");
//            } else if (x < 0 & y > 0) {
//                System.out.println("Value two part");
//            } else if (x < 0 & y < 0) {
//                System.out.println("Value three part");
//            } else if (x > 0 & y < 0) {
//                System.out.println("Value four part");
//            } else {
//                System.out.println("Bad coordinate");
//            }
//            count++;
//        }
//        int a = 54;
//        if (a < 100) {
//            int b = a%10;
//            int c = (a - b)/10;
//            System.out.println(b);
//            System.out.println(c);
//            if (b > c) {
//                System.out.println("b больше c");
//            } else {
//                System.out.println("b меньше c");
//            }
//        } else {
//            System.out.println("Bad number");
//        }

//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        while (count != 10){
//            System.out.println("enter minute: ");
//            int min = sc.nextInt();
//            if (min > 0 && min < 15){
//                System.out.println("One part");
//            } else if (min > 15 && min < 30) {
//                System.out.println("Two part");
//            } else if (min > 30 && min < 45) {
//                System.out.println("Three part");
//            } else if (min > 45 && min > 59) {
//                System.out.println("Four part");
//            } else {
//                System.out.println("Not range");
//            }
//            count++;
//        }

//        int a = 1234567890;
//
//        if (a == 0 || a == 2){
//            a += 7;
//            System.out.println("Number A+7 = " + a);
//        } else {
//            a /= 10;
//            System.out.println("Number A/10 = " + a);
//        }

        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count != 12) {
            System.out.println("Enter month number: ");
            int month = sc.nextInt();
            switch (month) {
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
                default:
                    System.out.println("Bad month");
            }
            count = month;
            if (count > 12) {
                break;
            }
        }
    }
}
