import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Positive,Negative,Zero: ");
        int num = sc.nextInt();

        if (num > 1) {
            System.out.print(num + " is a Positive number");
        } else if (num < -1) {
            System.out.print(num+" is a Negative number");
        } else {
            System.out.print("Zero");
        }
    }
}
