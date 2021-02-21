package mergetwoarrays;

public class MergeTwoArrays {

    public static void main(String[] args) {
        
        int[] a={2,4,6};
        int[] b={3,8,9,2}; 
        
        int a_leng=a.length;
        int b_leng=b.length;
        int c_leng=a_leng+b_leng;
        
        int[] c=new int [c_leng];
        
        for (int index=0; index<a_leng; index++){
           c[index]=a[index]; 
        }
        for (int index=0; index<b_leng; index++){
            c[a_leng+index]=b[index];
        }
        for (int index=0; index<c_leng; index++){
            System.out.print(c[index] + " ");
        }
        
        
        
    }
    
}
