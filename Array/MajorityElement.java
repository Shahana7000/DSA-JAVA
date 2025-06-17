public class MajorityElement {
    public static int majorityElement(int[] nums){
        int count = 0;
        int candidate = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
        }
        if(candidate == num){
            count ++;
        }
        else{
            count --;
        }
    }
    return candidate;
    }
public static void main(String[] args) {
    int[] nums = {3,2,2,1,2,2,1,1,1,1};
    System.out.println(majorityElement(nums));
}
}

