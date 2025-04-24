import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to see is it is Palindrome or Not: ");
<<<<<<< HEAD
        String str = sc.nextLine();

        boolean isPalindrome = true;
        int len = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is Not a Palindrome");
        }
    }
}
=======
        String str = sc.next();


    }
}
>>>>>>> 0d479e1ace72da08104046881eb38f564278b479
