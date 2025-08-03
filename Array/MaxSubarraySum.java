public class MaxSubarraySum {
    public static void subarraySum(int[] numbers){
        int maxSum = Integer.MIN_VALUE;
        int curre = 0;
        for(int i = 0;i<numbers.length;i++){
            int start = i;
            for(int j = i;j<numbers.length;j++){
                int end = j;
                curre = 0;

                for(int k = start;k<=end;k++){
                    curre += numbers[k];
                }
                System.out.println(curre);
                if(curre > maxSum){
                    maxSum = curre;
                }

            }
        }
        System.out.println(maxSum);
    }
    public static void main(String args[]){
        int[] numbers = {1,2,3,4,5};
        subarraySum(numbers);
    }

                
}
