package checkprimenumber;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        int no=7;
        int temp=0;
        
        for (int check=2; check<=no-1; check++){
            if (no%check==0){
                temp=temp+1;
            }
        }    
            if(temp>0){
                System.out.println("not prime");
            }
            else{
                System.out.println("PRIME");
            }
    } 
}
