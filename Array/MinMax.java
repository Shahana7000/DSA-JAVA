public class MinMax {
    public static void main(String args[]){
        int[] nums = {23, 33,44,67,23,43,89};
        int max = nums[0];
        int min = nums[0];

        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }

        }
        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
    }
}