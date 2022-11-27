package lessons;

import java.util.Scanner;

public class lessons_6 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        int arr[] = new int[100];
//
//        for (int i=0; i < 100; i++){
//            int x = (int)(Math.random()*(b-a+1) + a);
//            arr[i] = x;
//            System.out.println(arr[i]);
//        }

//        int fibNum[] = new int[10];
//        fibNum[0] = 1;
//        fibNum[1] = 1;
//
//        for (int i = 2; i < fibNum.length; i++){
//            fibNum[i] = fibNum[i-1]+fibNum[i-2];
//        }
//
//        for (int i = 0; i < fibNum.length; i++){
//            System.out.print(fibNum[i] + " ");
//        }

//        int a = 5;
//        int b = 10;
//        int arr[] = new int[10];
//        for (int i = 0; i < arr.length; i++){
//            int x = (int)(Math.random()*(b-a+1)+a);
//            arr[i] = x;
//            System.out.print(arr[i] + " ");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length array: ");
        int arr[] = new int[sc.nextInt()];
//
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = (int)(Math.random()*91+10);
//            System.out.print(arr[i] + " ");
//        }
//
//        int min = 100;
//
//        for (int j : arr) {
//            if (j <= min) {
//                min = j;
//            }
//        }
//        System.out.println("test " + min);
        int sum = 0;
        for (int i : arr){
            arr[i] = (int)(Math.random()*91+10);
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println();
        System.out.println("sum: " + sum);
        System.out.println("aver: " + (double)sum/(double) arr.length);
    }
}
