package pattern;

public class Pattern {

    public static void main(String[] args) {
        int rows=6;
        
        for (int counter=1; counter<=rows; counter++){
            
            for(int j=1; j<=counter; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }   
    }  
}
