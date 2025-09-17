public class TwiceArray {
    public static boolean ArrayTwice(int[] numbers){
        for(int i =0;i<numbers.length-1;i++){
            for(int j = i+1;j<numbers.length;j++){
                if(numbers[i] == numbers[j]){
                    return true;
                    
            }
            }
        }
        return false;
    }
    public static void ArrayPair(int[] numbers){//array pairs
        for(int i = 0;i<numbers.length-1;i++){
            for(int j = i+1;j<numbers.length;j++){
              
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");

            }
            System.out.println();
    }
}
public static int TargetArray(int[] numbers, int target){
    for(int i =0;i<numbers.length;i++){
        if(numbers[i] == target){
            return i ;
        }
        
    }
    return -1;
}
public static void ProfitLoss(int[] numbers){
    
}
    

    
   

    public static void main(String args[]){
        // int[] numbers = {1,2,3,4,5,6,7,1,};
        // System.out.println(ArrayTwice(numbers));
        //   ArrayPair(numbers);
        int[] numbers = {1,2,3,0};
        System.out.println(TargetArray(numbers, 3));

    
}
    }

