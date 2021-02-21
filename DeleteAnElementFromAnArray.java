package deleteanelementfromanarray;

public class DeleteAnElementFromAnArray {

    public static void main(String[] args) {
        int[] arr={3,4,2,1,7};
        int del=2;
        
        for(int index=0; index<arr.length; index++){
            if (del==arr[index]){
                for (int j=index; j<arr.length-1; j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for (int index=0; index<arr.length-1; index++){
            System.out.println(arr[index]+" ");
        }
    }   
}
