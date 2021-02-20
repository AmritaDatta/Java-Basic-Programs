package kthlargestorsmallestelementinarray;

public class KthLargestOrSmallestElementInArray {

    public static void main(String[] args) {
        
        int[] arr={5,8,12,7,6,2,4};
        int k=4;
        
        for (int index=0; index<arr.length-1; index++){
            for (int j=index+1; j<arr.length; j++){
                
                //if (arr[index]>arr[j] - For finding kth smallest element
                if (arr[index]<arr[j]){
                    
                    int temp=arr[index];
                    arr[index]=arr[j];
                    arr[j]=temp;
                    
                }
            }
            if (index==k-1){
                System.out.println(k + " largest element is: " + arr[index]);
                break;
            }
        }
        //For Sorted array
        for (int index=0; index<arr.length; index++){
            System.out.print(arr[index]+ " ");
        }
    }
}
