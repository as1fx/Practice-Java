import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for Factorial: ");
        int num = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.print("Factorial of the number is: " + fact);
    }
}
