// public class StarPattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=i*2-1;j++){
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//         for(int i = 1;i<=n-1;i++){
//             for(int j = 1;j<=2*(n-i)-1;j++){
//                 System.out.print(" *");
    
// }
// System.out.println();
// }
//     }
// }
public class StarPattern {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<n-1;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i*2-1;k++){
                System.out.print("*");
        }
        System.out.println();
}
    }
}

