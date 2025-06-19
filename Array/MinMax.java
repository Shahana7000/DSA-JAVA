public class MinMax {
    public static void main(String args[]){
        int[] numss = {23, 33,44,67,23,43,89};
        int max = numss[0];
        int min = numss[0];

        for(int i = 0;i<numss.length;i++){
            if(numss[i] > max){
                max = numss[i];
            }
            if(numss[i] < min){
                min = numss[i];
            }

        }
        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
    }
}