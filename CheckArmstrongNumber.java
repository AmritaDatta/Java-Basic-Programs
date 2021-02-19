package checkarmstrongnumber;

public class CheckArmstrongNumber {

    public static void main(String[] args) {
        
        // xy..z = xn + yn+.....+ zn
        
        int num=370; 
        int number;
        int temp;
        int total=0;

        number=num;
        
        while(number != 0){
            temp=number%10;
            total=total+temp*temp*temp;
            number /=10;
        }
        if(total==num){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }

    }
}
