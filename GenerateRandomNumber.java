package generaterandomnumber;
//In the below program, we are using the nextInt() method of Random class to serve our purpose.
import java.util.Random;

public class GenerateRandomNumber {

    public static void main(String[] args) {
      int counter;
      Random rnum = new Random();
      /* Below code would generate 5 random numbers
       * between 0 and 200.
       */
      System.out.println("Random Numbers:");
      System.out.println("***************");
      for (counter = 1; counter <= 5; counter++) {
         System.out.println(rnum.nextInt(200));
      }
    }
}
