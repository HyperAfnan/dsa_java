public class PAssingFunction {
   public static void main(String[] args) {
      int nums[] = { 1, 2, 3, 4, 5 };
      System.err.println(nums[1]); // returns 2
      change(nums);
      System.err.println(nums[1]); // returns 99
   }

   static void change(int arr[]) {
      arr[1] = 99;
   }
}
