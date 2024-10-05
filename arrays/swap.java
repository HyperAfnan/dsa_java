import java.util.Arrays;

public class swap {
   public static void main(String[] args) {
      int num[] = { 1, 2, 3, 4, 5 };
      // swap(num, 0, 1);
      reverse(num);
      System.err.println(Arrays.toString(num));
   }

   private static void swap(int[] num, int i, int j) {
      int temp = num[i];
      num[i] = num[j];
      num[j] = temp;
   }

   private static void reverse(int[] arr) {
      int init_val = 0;
      int final_val = arr.length -1;

      for (int i = 0; i < arr.length/2; i++) {
         swap(arr, init_val, final_val);
         init_val ++;
         final_val --;
      }
   }

}
