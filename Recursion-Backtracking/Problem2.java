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
public static int FactPrint(int n){
    if(n==0){
        return 1;
        
    }
    int fn1 = FactPrint(n-1);
    int fn = n * FactPrint(n-1);
    return fn ;
}
public static int NaturalNum(int n){
    if(n==1){
        return 1;
        
    }
    int fn1 = NaturalNum(n-1);
    int fn = n + NaturalNum(n-1);
    return fn ;
}
public static int FibboNum(int n){
    if(n==0||n==1){
        return n;
    }
    int fnm1 = FibboNum(n-1);
    int fnm2 = FibboNum(n-2);
    int fn = fnm1 + fnm2;
    return fn ;
}
public static boolean isSorted(int[] arr, int i){
    if(i==arr.length-1){
        return true;

    }
    if(arr[i] > arr[i+1]){
        return false;
    }
    return isSorted(arr, i+1);

}
public static int firstOccrence(int arr[], int key, int i){
    if(i==arr.length){
        return -1;
    }
    if(arr[i] == key){
        return i;
    }
    return firstOccrence(arr, key, i+1);
}
public static int lastOccrence(int arr[], int key, int i){
    if(i == arr.length){
        return -1;
    }
    int isFound = lastOccrence(arr, key, i+1);
    if(isFound == -1 && arr[i] == key){
        return i;
    }
    return isFound;
}
    public static void main(String[] args){
    //     int n = 5;
    //     // PrintReverseNum(n);
    // //    System.out.println(NaturalNum(n));
    //    System.out.println(FibboNum(n));
    int arr[] = {1,2,9,5,4,};
   System.out.println(lastOccrence(arr,9, 0));
      

    }
    
}
