import java.util.Scanner;

public class PowerUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to see the base of the number: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent number: ");
        int exponent = sc.nextInt();

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}