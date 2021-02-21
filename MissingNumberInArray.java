package missingnumberinarray;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        
        int xor1=arr[0];       
        for(int index=1; index<arr.length; index++){
            xor1=xor1^arr[index];   //XOR -> Commutative (a+b=b+a), Associative [(a+b)+c=a+(b+c)]
        }
        
        int xor2=1;
        for(int index=2; index<=arr.length+1; index++){
            xor2=xor2^index;
        }
        
        System.out.println("Missing no is: " + (xor1^xor2));
    }    
}