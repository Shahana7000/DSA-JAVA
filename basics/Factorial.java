import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int f = 1;
        for(int i = 1; i<=n;i++){
             f = f * i;
            System.out.println(f);
        }
    }
    
}
