import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.print("Before Swapping : " + first + " " + second);

        first = first + second;
        second = first - second;
        first = first - second;

        System.out.print("\nAfter Swapping : " + first + " " + second);
    }
}
