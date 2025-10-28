package ArrayList;
import java.util.*;

public class problem1 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(8);
    
    int key = 10;
    for(int i=0; i<list.size();i++){
        if(list.get(i) == key){
        System.out.println(list.get(i));
    }
    else{
        System.out.println("not found");
    }
}


}
}
