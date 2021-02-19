
package floydtriangle;
        
public class FloydTriangle {

    public static void main(String[] args) {
        int rows=7; 
        int number=1;
        
        for (int counter=1; counter<=rows; counter++){
            
            for(int j=1; j<=counter; j++){
                
                System.out.print(number+" ");
                number++;
            
            }
            
            System.out.println();
        
        }
        
        
        




    }
    
}
