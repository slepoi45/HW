package HW2;

import java.util.Scanner;

public class HW2_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        double S = Math.PI * Math.pow(R, 2);
        double D = Math.pow(Math.PI, 2) * R;

        System.out.println("Площадь окружности: " + S);
        System.out.println("Длинна окружности: " + D);


    }
}