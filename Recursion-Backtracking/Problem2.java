public class Problem2 {
    public static void PrintReverseNum(int n){

        if(n==1){
            System.out.println(n);
            return;
        }
     System.out.print(n + " ");
        PrintReverseNum(n-1);
    }


    public static void main(String[] args){
        int n = 10;
        PrintReverseNum(n);
      

    }
    
}
