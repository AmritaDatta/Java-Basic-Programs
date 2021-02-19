package factorial;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the no: ");
        
        Scanner in=new Scanner (System.in);
        number=in.nextInt();
        
        long fact=1;
        int i=1;
        
        while(i<=number){
           fact=fact*i;
           i++;
        }
        System.out.println("Factorial no: "+ number + " is " + fact);
    }  
}