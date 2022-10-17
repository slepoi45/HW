package HW2;

import java.util.Scanner;

public class HW2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вносимую сумму: ");
        double P = sc.nextDouble();
        System.out.println("Под какой процент вы делаете вклад: ");
        double l = sc.nextDouble();
        System.out.println("Кол-во дней: ");
        int T = sc.nextInt();
        int K = 365;
        double S = ((P * l * T) / K) / 100;

        System.out.println("На вкладе будет: " + (S + P) + " через: " + T + " дней");
    }
}
