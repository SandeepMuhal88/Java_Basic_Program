import java.util.Scanner;
public class Bitwise {
    public static void main(String[] var0) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number:-");
        int val1=sc.nextInt();
        System.out.println("Enter second Number:-");
        int val2=sc.nextInt();
   
       System.out.println(val1 /val2);
    //    System.out.println(var1 / var2);
        System.out.println(val1&val2);
    //    System.out.println(var1 & var2);
    //    System.out.println(var1 ^ var2);
       System.out.println(val1 ^val2 );
    //    System.out.println(var1 << 1);
       System.out.println(val1>>1);

    //    System.out.println(var1 >> 1);
    System.out.println(val1 << 2);
    //    System.out.println(var1 >> 2);
    System.out.println(val2>>1);
    System.out.println(val2<<2);

    //    System.out.println(var1 << 2);
    }
}
