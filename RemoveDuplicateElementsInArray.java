package removeduplicateelementsinarray;

import java.util.HashSet;

public class RemoveDuplicateElementsInArray {

    public static void main(String[] args) {
       int[] arr={1,2,7,2,6,8};
       
        HashSet<Integer> hs=new HashSet<>();
        
        for(int no:arr){
            hs.add(no);
        }
        for (int no:hs){
            System.out.println(no);
        }
    }
    
}
