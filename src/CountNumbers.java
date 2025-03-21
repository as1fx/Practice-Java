import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count how much digit is available: ");
        int num = sc.nextInt();

        int count = 0;
        while (num > 0){
            int digit = num % 10;
            count++;
            num /= 10;
        }
        System.out.println(count);
    }
}
