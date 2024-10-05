public class max {
   public static void main(String[] args) {
      int nums[] = {
            1, 2, 3, 4, 5, 0
      };
      max(nums);
   }

   private static void max(int[] arr) {
      int max = arr[0];

      for (int i = 0; i < arr.length; i++) {
         if (max < arr[i]) {
            max = arr[i];
         }
      }
      System.err.println(max);
   }
}
