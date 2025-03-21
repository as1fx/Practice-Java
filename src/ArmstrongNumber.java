import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to see is it is a Armstrong or Not: ");
        int num = sc.nextInt();

        int temp = num;
        int digitCount = 0;

        while(temp > 0){
            temp /= 10;
            digitCount++;
        }

        temp = num;
        double total = 0;

        while (temp >0){
            int digit = temp % 10;
            total += Math.pow(digit,digitCount);
            temp /= 10;
        }

        if(num == total){
            System.out.println(num +" is a Armstrong number");
        }
        else {
            System.out.println(num +" is Not a Armstrong number");
        }
    }
}