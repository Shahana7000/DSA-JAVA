import java.util.*;
public class LargestValue {
    public static int largestValue(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
            return largest;
        }

    

public static void main(String args[]){
    int [] numbers = {1,2,3,4,5};

    System.out.println("the largest number "+largestValue(numbers));
}
}


