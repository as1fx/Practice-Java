import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year to check if it is a Leap Year or Not: ");
        int num = sc.nextInt();

        if (num % 100 == 0 && num % 400 != 0) {
            System.out.println(num + " is Not a Leap Year");
        } else if (num % 4 == 0 || num % 100 == 0 || num % 400 == 0) {
            System.out.println(num + " is a Leap Year");
        } else {
            System.out.println(num + " is Not a Leap Year");
        }
    }
}