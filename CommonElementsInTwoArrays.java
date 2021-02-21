package commonelementsintwoarrays;

import java.util.HashSet;

public class CommonElementsInTwoArrays {

    public static void main(String[] args) {
        int[] arr1={3,5,8,3,6,9,15};
        int[] arr2={8,5,7,3,9,4};
        
        HashSet<Integer> hs=new HashSet<>();
        
        for (int no:arr1){
            hs.add(no);
        }
        for (int no:arr2){
            if (hs.add(no)==false)       //add() - HashSet's method; It probites Boolean
            {
                System.out.println(no);
            }
        }
    }   
}
