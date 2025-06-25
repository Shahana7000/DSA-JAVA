public class pairOfsum {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9};
        int target = 7;
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int pairSum = arr[i] + arr[j];


            if(pairSum > target){
                j--;
            }
                else if(pairSum < target){
                    i++;
                }
                else{
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] +")" );
                    i++;
                    j--;
                }
            }
}
}
