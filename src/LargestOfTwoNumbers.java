import java.util.Arrays;
import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        if (first > second) {
            System.out.print("First number is Greater..");
        } else {
            System.out.print("Second number is Greater..");
        }
    }
}
