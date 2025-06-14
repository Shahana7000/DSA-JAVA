public class PrimeCount {

  
    public static void main(String[] args) {
        PrimeCount pc = new PrimeCount();
        int n = 10; 
        int result = pc.countPrimes(n);
        System.out.println("Number of primes less than " + n + " is: " + result);
    }

    public int countPrimes(int n) {
        int counter = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }
        return counter;
    }

    public boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
