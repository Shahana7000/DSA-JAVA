public class halfparamind {
    public static void paramint(int n){
        for(int i = 1;i<n;i++){
            for(int j = 1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
        }
        System.out.println();
    }
}
public static void numberpyramid(int n){
    for(int i = 1;i<=n;i++){
        for(int j = 1;j<=n-i+1;j++){
            System.out.print(j);
        }
         System.out.println();
    }
   
}
public static void floyd(int n){
    int counter = 1;
    for(int i =1;i<=n;i++){
        for(int j = 1;j<=i;j++){
            System.out.print(counter);
            counter++;
    }
    System.out.println();
}
}
    public static void main(String[] args) {
        paramint(5);
        numberpyramid(5);
        floyd(5);
}
    }
