public class HollowRectangle {
    public static void printHollowRectangle(int rows, int colums){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=colums;j++){
                if(i==1 || i==rows || j==1 || j==colums){
                    System.out.print(" *");
            }else{
                System.out.print("  ");
            }

        }
        System.out.println();
    }
}
public static void Trianle(int n){
    for(int i =1;i<=n;i++){
        for(int s=1;s<=n-i;s++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            if(j==1||j==2*i-1|i==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
public static void main(String args[]){
    printHollowRectangle(5, 10);
    Trianle(5);


}
}

