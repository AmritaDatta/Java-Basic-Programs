package palindromecheck;

public class PalindromeCheck {

    public static void main(String[] args) {
        
        String name="abcacba";
        String rev="";
        
        int lang=name.length();
        
        for (int index=lang-1; index>=0; index--){
            rev=rev+name.charAt(index);
        }
        System.out.println("Reverse of "+name+" is "+rev);
        
        if (name.equals(rev)){
            System.out.println("Palindrome string");
        }
        else{
            System.out.println("Not Palindrome string");
        }
    }
    
}
