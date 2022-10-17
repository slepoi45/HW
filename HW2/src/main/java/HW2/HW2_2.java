package HW2;

import java.util.Scanner;

public class HW2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press number width: ");
        double width = sc.nextDouble();
        System.out.println("Press number heidth: ");
        double heidth = sc.nextDouble();

        double S = width * heidth;
        double P = (width + heidth) * 2;

        System.out.println("Площадь прямоугольника: " + S);
        System.out.println("Периметр прямоугольника: " + P);
    }
}
