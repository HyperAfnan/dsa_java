import java.util.Arrays;

public class change_value {
   public static void main(final String[] args) {
      /* array */
      int[] ar = { 1, 2, 3, 5, 69, 70 };
      change(ar);
      System.out.println(Arrays.toString(ar));
   }

   /* In this code , the value of num is changed at 0th Index */
   static void change(final int num[]) {
      num[0] = 99;
   }

}
