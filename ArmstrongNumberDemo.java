package armstrongnumberdemo;

import java.util.Scanner;

public class ArmstrongNumberDemo {

    public static void main(String[] args) {
        
        int num, start, end, rem, temp, counter=0;
        
        Scanner in = new Scanner(System.in);
        
	System.out.print("Enter the start number: ");
	start = in.nextInt();
        
	System.out.print("Enter the end number: ");
	end = in.nextInt();
        
	in.close();
        //generate Armstrong numbers between start and end
        for (int i=start+1; i<=end; i++){
            
            temp=i;
            num=0;
             while(temp!=0){
                 rem=temp%10;
                 num=num+rem*rem*rem;
                 temp=temp/10;
             }
             if(i==num){
                 if(counter==0){
                     System.out.print("Armstrong Numbers Between "+start+" and "+end+": ");
                 }
                 System.out.print(i + "  ");
                 counter++;
             }
        }
        // if no Armstrong number is found
        if(counter == 0){
	   System.out.print("There is no Armstrong number Between "+start+" and "+end);
	}
    }  
}
