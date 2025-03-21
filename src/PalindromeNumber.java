import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Palindrome number: ");
        String num = sc.next();

        String reversed = new StringBuilder(num).reverse().toString();

        if (num.equals(reversed)) {
            System.out.println(num + " is a Palindrome number");
        } else {
            System.out.println(num + " is not a Palindrome number");
        }
    }
}
