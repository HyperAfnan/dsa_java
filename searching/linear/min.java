// Find the minimum number in an array 
public class min {
   public static void main(String[] args) {
      int num[] = { 23, 4, 7, 33, 67, 3, 56, 86, 99 };
      int answer = minimum(num);
      System.out.println(answer);
   }

   private static int minimum(int[] arr) {
      if (arr.length == 0) {
         return 0;
      }
      int mini = arr[0];
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] < mini) {
            mini = arr[i];
         }
      }
      return mini;
   }
}
