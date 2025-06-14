public class PrimeCount{
   public static void main(String args[]) {
        int counter = 0;

        for(int i = 2;i<n;i++){
            if(isPrime(i)){
                counter++;

            }
        }
       return counter;
    }
    public boolean isPrime(int num){
        for(int i = 2;i*i<=num;i++){
            if(num % i ==0)return false;
        }
        return true;
    }
}


    

            
        
    
            