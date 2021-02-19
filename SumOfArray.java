package sumofarray;

public class SumOfArray {
    
    public static void main(String[] args) {
        
        int[] array={2,3,5,6,9,7};
        int sum=0;
        
        //advance for loop
        for (int num:array){
            sum=sum+num;
        }
        
        System.out.println("total= "+sum);
    }
    
}
