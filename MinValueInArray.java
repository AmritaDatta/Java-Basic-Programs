package minvalueinarray;

public class MinValueInArray {

    public static void main(String[] args) {
        
        int[] arr={33,44,66,22,28};
        int min=arr[0];
        
        for (int i=1; i<arr.length; i++){
            if (min>arr[i]){
            min=arr[i];
            }
        }
        System.out.println("Minimum value of Array is: " + min);
    }   
}
