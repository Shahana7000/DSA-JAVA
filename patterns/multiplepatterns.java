public class multiplepatterns {
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
public static void BinaryPyramid(int n){
    for(int i = 1;i<=n;i++){
        for(int j = 1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
        }
        
    
}
System.out.println();
    }
}
public static void butterflyPyramid(int n ){
    for(int i = 1;i<=n;i++){
        for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        for(int j = 1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j = 1;j<=i;j++){
            System.out.print("*");
}
System.out.println();
    }

for(int i = n;i>=1;i--){
    for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        for(int j = 1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j = 1;j<=i;j++){
            System.out.print("*");
}
System.out.println();
    }
}



    public static void main(String[] args) {
        paramint(5);
        numberpyramid(5);
        floyd(5);
        BinaryPyramid(5);
        butterflyPyramid(5);
       
}
    }
