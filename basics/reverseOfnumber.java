import java.util.Scanner;

public class reverseOfnumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int reverse = 0;
        while(number !=0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
            System.out.println("the reverse of given number is :" + reverse );
        }
    }
}
