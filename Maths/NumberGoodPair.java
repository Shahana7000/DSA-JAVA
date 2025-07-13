public class NumberGoodPair {

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 1, 3, 3, 5};

        NumberGoodPair obj = new NumberGoodPair();
        int result = obj.numIdenticalPairs(nums);

        System.out.println("Total good pairs: " + result);
    }
}
