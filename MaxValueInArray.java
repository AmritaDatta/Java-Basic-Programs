package maxvalueinarray;

import java.util.Scanner;

public class MaxValueInArray {

    public static void main(String[] args) {
        System.out.println("How many numbers you want to enter?");
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        
        int[] arr=new int[n];
        
        for (int i=0; i<arr.length; i++){
        System.out.println("Enter the elements: ");
        arr[i] = in.nextInt();
        }
        
        int max=arr[0];
        
        for (int i=1; i<arr.length; i++){
            if (max<arr[i]){
            max=arr[i];
            }
        }
        System.out.println("Maximum value of Array is: " + max);
    }
}
