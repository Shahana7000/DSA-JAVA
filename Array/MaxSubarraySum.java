public class MaxSubarraySum {
    public static void subarraySum(int[] numbers){
        int maxSum = Integer.MIN_VALUE;
        int curre = 0;
        int prefix[] = new int[numbers.length];
        for(int i =1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i = 0;i<numbers.length;i++){
            int start = i;
            for(int j = i;j<numbers.length;j++){
                int end = j;
                curre = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

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
