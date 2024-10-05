import java.util.Arrays;

public class varArgs {
   public static void main(String[] args) {
      fun(1, 2, 3);
   }

   /*
    * int ...v signifies an array of integers
    * similarly String ..v signifies an array of strings
    */
   public static void fun(int... v) {
      System.err.println(Arrays.toString(v)); // returns [1, 2, 3]
   }
}
