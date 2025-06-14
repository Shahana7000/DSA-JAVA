import java.util.Scanner;

public class Palindrom {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;
        while(num > 0){
            int reminder = num % 10;
            rev = rev*10+reminder;
            num = num/10;
        }
        if(original == rev){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
}

    
