import java.util.Scanner;

public class PrimeNumberPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print Prime Number: ");
        int num = sc.nextInt();

        System.out.print("Prime number from 1 to " + num + " are ");

        int sum = 0;

        for (int i = 2; i <= num; i++) {

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\n" + sum);
    }
}








