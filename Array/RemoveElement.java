public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        if(nums.length==0)return 0;

        int i = 0;

        for(int j = 0;j<nums.length;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;

    }
    public static void main(String arg[]){
        int[] nums = {2,3,3,2,2};
        int val = 2;
        int k = removeElement(nums,val);
        System.out.print(k);


    
    }
    
}
