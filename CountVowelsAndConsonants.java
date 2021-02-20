package countvowelsandconsonants;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        
        String str="Bamohernukni";
        int vcount=0, ccount=0;
        
        //converting all the chars to lowercase
        
        str=str.toLowerCase();
        for(int index=0; index<str.length(); index++){
            
            char ch=str.charAt(index);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            vcount++;      
            }
            else if (ch > 'a' && ch <= 'z'){
            //else {    
                ccount++;
            }
        }
        System.out.println("Number of Vowels:" + vcount);
        System.out.println("Number of Consonants:" + ccount);
    }
}
