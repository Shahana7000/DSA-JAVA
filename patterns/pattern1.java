public class pattern1 {
    public static int patternPrint(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print( " * ");
            }
            System.out.println();
        }
        return n;
    }
    public static void main(String args[]){
        System.out.print(patternPrint(5));
    }
    
}
