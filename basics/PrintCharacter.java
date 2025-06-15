import java.util.Scanner;
public class PrintCharacter {
    public static void main(String args[]){
      System.out.print("enter the number for character : ");
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 98;i<n;i++){
            System.out.print((char) i + " ");
        }
    }
}
       