public class Problem2 {
    public static void PrintReverseNum(int n){

        if(n==1){
            System.out.println(1);
            return;
        }
     System.out.print(n + " ");
        PrintReverseNum(n-1);
    }

public static void PrinInc(int n){
    if(n==1){
        System.out.println(n +" ");
        return ;
    }
    PrinInc(n-1);
    System.out.println(n + " ");
}
    public static void main(String[] args){
        int n = 10;
        // PrintReverseNum(n);
        PrinInc(n);
      

    }
    
}
