public class Fibonacci {
    public static void main(String args[]) {
        int n = 20;
        int first = 0, second = 1;
        System.out.print(first + " " + second);

        for(int i = 2; i < n; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.print(" " + next);
        }
    }
}
