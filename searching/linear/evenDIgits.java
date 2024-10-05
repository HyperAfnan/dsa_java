
// Q: Find numbers with even  number of digits 
public class evenDIgits {
   public static void main(String[] args) {

      int nums[] = { 12, 345, 2, 6, 7896, 1234 };
      int answer = find(nums);
      System.out.println(answer);

   }

   public static int find(int[] arr) {
      if (arr.length == 0) {
         return 0;
      }
      int count = 0;
      for (int i = 0; i < arr.length; i++) {
         if (even(arr[i])) {
            count++;
         }
      }
      return count;
   }

   public static boolean even(int num) {
      int numberOfDigits = digits(num);
      return numberOfDigits % 2 == 0;
   }

   public static int digits(int num) {
      int count = 0;

      while (num > 0) {
         num = num / 10;
         count++;
      }
      return count;
   }
}
