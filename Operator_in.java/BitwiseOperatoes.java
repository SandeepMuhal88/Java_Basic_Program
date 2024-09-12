public class BitwiseOperatoes {
    public static void main(String[] args) {
        int p=9,q=10;
        System.out.println(p/q);
        System.out.println(p&q);
        System.out.println(p^q);

        System.out.println(p<<1);
        System.out.println(p>>1);
        System.out.println(p>>2);
        System.out.println(p<<2);

    }
    
}

// import java.util.Scanner;

// public class ReverseNumber {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter a digitr: ");
//         int number = scanner.nextInt();
        
//         int reversedNumber = reverseDigits(number);
        
//         System.out.println("Reversed number: " + reversedNumber);
        
//         scanner.close();
//     }
    
//     public static int reverseDigits(int number) {
//         int reversedNumber = 0;
        
//         while (number != 0) {
//             int digit = number % 10;
//             reversedNumber = reversedNumber * 10 + digit;
//             number /= 10;
//         }
        
//         return reversedNumber;
//     }
// }
