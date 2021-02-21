package insertanelementintoanarray;

public class InsertAnElementIntoAnArray {

    public static void main(String[] args) {
        int[] arr={3,4,6,1,9,7};
        int pos=3, element=100;
        
        for (int index=arr.length-1; index>=pos-1;index--){
            
            arr[index]=arr[index-1];
        }
        
        arr[pos-1]=element;
        
        for (int index=0; index<arr.length; index++){
            System.out.println(arr[index]);
        }
    }
}
