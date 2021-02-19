package smallestofthreenumbers;

public class SmallestOfThreeNumbers {

    public static void main(String[] args) {
        int num1=68;
        int num2=8;
        int num3=78;
        int result;
        int temp;
        
        result=num3<(num2<num3?num2:num3)?num3:(num2<num3?num2:num3);
            
        System.out.println("Smallest no is "+result);

    }
    
}