package Loops;
import java.util.Scanner;

public class MultiplicationTable {
   public MultiplicationTable() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      System.out.println("Multiplication Table of " + var2);
      System.out.println("-------------------------");

      for(int var3 = 1; var3 <= 10; ++var3) {
         int var4 = var2 * var3;
         System.out.println("" + var2 + " x " + var3 + " = " + var4);
      }

   }
}

