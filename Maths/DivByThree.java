public class DivByThree {
    
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 3 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        
        DivByThree obj = new DivByThree();
        int result = obj.minimumOperations(nums);
        
        System.out.println("The count of numbers not divisible by 3 is: " + result);
    }
}
