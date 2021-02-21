package sumorcountofevenoroddnumbersinarray;

import java.util.ArrayList;

public class SumOrCountOfEvenOrOddNumbersInArray {

    public static void main(String[] args) {
        
        int[] arr={3,5,2,8,9,6,8};
        int total1=0, total2=0;
        
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        
        for (int index=0; index<arr.length; index++){
            
            if (arr[index]%2==0){
                even.add(arr[index]);             
            }
            else {
                odd.add(arr[index]);
            }
        }
        System.out.print("Even no: ");
        for (int no:even){
            System.out.print(no + " ");
            total1=total1+no;       //find out sum
        }
        System.out.println("\nSum= " + total1);
        System.out.println("Total even no:" + even.size());  
        
        System.out.print("Odd no: ");
        for (int no:odd){
            System.out.print(no + " ");
            total2=total2+no;
        }
        System.out.println("\nSum= " + total2);
        System.out.println("Total odd no: " + odd.size());
    }    
}