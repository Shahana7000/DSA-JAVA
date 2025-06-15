import java.util.Scanner;

public class reverseOF{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            number = number / 10;

            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                System.out.println("Overflow! Cannot reverse the number safely.");
                return;
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {
                System.out.println("Underflow! Cannot reverse the number safely.");
                return;
            }

            reverse = reverse * 10 + digit;
        }

        System.out.println("The reverse of " + original + " is: " + reverse);
    }
}
