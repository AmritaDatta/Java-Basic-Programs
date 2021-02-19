package hcmlcm;

public class HcmLcm {
    
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        
        int num1;
        int num2;
        int temp;
        int hcf;
        
        num1=a;
        num2=b;
        
        while (num1 !=0){
        temp = num1;
        num1 = num1%num2;
        num2 = temp;
        }
        hcf = num2;
        System.out.println("Hcf =" + hcf);
        System.out.println("Lcm =" + (a*b)/ hcf);
    }  
}
