package primenumberdemo;

import java.util.Scanner;

public class PrimeNumberDemo {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the no: ");
        
        Scanner in=new Scanner (System.in);
        n=in.nextInt();
        
        for (int num=2; num<=n; num++){
            Boolean isPrime=true;
            for (int j=2; j<num; j++){
                if (num%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num);
            }
        }
    }
    
}
