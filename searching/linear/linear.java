// Q: Find weather 14 exists in an array or not
public class linear {
   public static void main(String[] args) {
      int array[] = { 18, 12, 9, 14, 77, 50 };
      int var = 2; // variable to Find
      int answer = linearinarray(array, var);
      System.out.println(answer);
   }

   private static int linearinarray(int[] array, int var) {
      for (int i = 0; i < array.length; i++) {
         if (array[i] == var) {
            return i;
         }
      }
      return Integer.MAX_VALUE;
   }
}
