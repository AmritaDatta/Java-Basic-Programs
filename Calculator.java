package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        double num1, num2, output;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter first no: ");
        num1=in.nextDouble();
        
        System.out.println("Enter second no: ");
        num2=in.nextDouble();
        
        System.out.println("Enter Char Operator(+,-,*,/): ");
        char operator=in.next().charAt(0);
        
        in.close();
        
        switch(operator){
            case'+':
                output=num1+num2;
                break;
            
            case'-':
                output=num1-num2;
                break;
                
            case'*':
                output=num1*num2;
                break;
                
            case'/':
                output=num1/num2;
                break;
                
            default:
                System.out.println("You have entered wrong operator");
                return;
        }
        System.out.println(num1+" "+operator+" "+num2+"="+output);
    }    
}
