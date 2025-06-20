import java.util.*;

public class GCDcalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        int gcd = calculateGCD(num1, num2);  
        System.out.println("GCD is: " + gcd);  

        sc.close(); 
    }
public static int calculateGCD(int num1, int numm2) {
        while (numm2 != 0) {
            int temp = numm2;
            numm2 = num1 % numm2;
            num1 = temp;
        }
        return num1;
    }
}
