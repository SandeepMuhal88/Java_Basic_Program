package Loops;

import java.util.Scanner;

public class NumericalPatter {
     public static void main(String[] var0) {
      Scanner IN = new Scanner(System.in);
      System.out.println("Enter number of Rows");
      int num = IN.nextInt();

      for(int i = 1; i <= num; ++i) {
         int j;
           for(j = 1; j <= num - i; ++j) {
               System.out.print(j);
            }

         for(j = 1; j <= i; ++j) {
               System.out.print(j);
             }

         for(j = num - i; j > 0; --j) {
              System.out.print(j);
             }

         System.out.println();
         }
     
    }
}
