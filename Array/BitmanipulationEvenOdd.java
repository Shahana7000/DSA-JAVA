public class BitmanipulationEvenOdd {
    public static void EvenOrOdd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){
        EvenOrOdd(9);
        EvenOrOdd(10);
        EvenOrOdd(3);
        EvenOrOdd(8);
    }
    
}
