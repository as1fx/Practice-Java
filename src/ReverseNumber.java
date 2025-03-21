import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for reverse: ");
        int num = sc.nextInt();

//        int reversed = 0;
//        while (num != 0) {
//            int digit = num % 10; // Last digit
//            reversed = reversed * 10 + digit; // Add digit to reversed number
//            num /= 10; // Removed last digit
//        }
//        System.out.println("Reverse number is: " + reversed);

        int reversed = 0;
        for (; num != 0; num /= 10) { // Another use of FOR LOOP
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed: " + reversed);
    }
}
