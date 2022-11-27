package HW3;

import java.time.LocalDate;
import java.util.Scanner;

public class HW3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter r or e for show week day: ");
        String lang = sc.next();

        if (!(lang.equals("r")) && !(lang.equals("e"))){
            System.out.println("Незнакомый язык");
            return;
        }

        if (lang.equals("r")){
            System.out.println("пн, вт, ср, чт, пт, сб, вс");
        } else {
            System.out.println("Mon, Tues, Wed, Thurs, Fri, Sat, Sun");
        }

    }
}
