package duplicateelementsinarray;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {

    public static void main(String[] args) {
        
        int[] arr={2,4,5,3,2,5,6};
        
        //Set Interface; It can't store duplicate elements; we can't create object of Interface;
        //Creating Refference of Set Interface
        //<Integer> - Generics; s - refference;
        //HashSet is a class, we can creat object of it;
        
        Set<Integer> s=new HashSet<>();
        
        for (int no : arr){
            if (s.add(no)== false){
                System.out.println(no);
                //break; -> if we need to find 1st duplicate element in array.
            }
        }  
    }
}
