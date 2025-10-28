import java.util.*;

public class Problem2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter the number for your arraylist input");
        int n = sc.nextInt();
        int max = 0;
        int min = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
            max = Math.max(max, list.get(i));
            min = Math.min(min, list.get(i));

        }
        System.out.println(list);
        System.out.println(max);
        System.out.println(min);

    }

}
