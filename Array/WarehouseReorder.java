import java.util.Scanner;
public class WarehouseReorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()); // Number of products

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            String name = parts[0];
            int current = Integer.parseInt(parts[1]);
            int reorder = Integer.parseInt(parts[2]);

            if (current < reorder) {
                System.out.println(name);
            }
        }
    }
}


