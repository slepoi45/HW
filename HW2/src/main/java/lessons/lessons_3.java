package lessons;

import java.util.Scanner;

public class lessons_3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

//       int x = sc.nextInt();
//       int y = sc.nextInt();
//
//       if (x<y){
//           for (; x<y; x++){
//               if (x%2 == 0){
//                   System.out.print(x + " ");
//               }
//           }
//       } else {
//           for (; y<x; y++){
//               if (y%2 == 0){
//                   System.out.print(y + " ");
//               }
//           }
//       }
        int x = sc.nextInt();
        for (; x<0; x--){
            System.out.print("*");
        }
    }
}
