public class main {
   public static void main(String[] args) {
      /*
       * Binary Search
       * 
       * we suppose the array is a sorted array
       * In binary search we take the middle element compare it with target, if its
       * true, the target is the middle element, if the target is greater than the
       * middle element we do the same thing with the elements after the middle
       * element and if the target is less than the middle element we do the same
       * thing for element before the middle element
       * 
       * total comparisons in the worst case will be log N with base 2 where N is
       * the length of arr
       * 
       * total comparisons in the best case will be 1
       * 
       * 
       * Why Binary Search?
       * if there is an array of one millions elements, the linear search will make
       * one million comparisons in the worst case, but for binary search it will make
       * log 1000000 with base 2 which is only 20
       */

      int num[] = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
      int t = 48;
      int answer = binary_search(num, t);
      System.out.println(answer);
   }

   private static int binary_search(int[] arr, int target) {
      if (arr.length == 0) {
         return 0;
      }

      int start = 0;
      int end = arr.length;

      while (start <= end) {

         int mid = start + (end - start) / 2;
         if (target < arr[mid]) {
            end = mid - 1;
         } else if (target > arr[mid]) {
            start = mid + 1;
         } else {
            return mid;
         }
      }

      return 0;
   }
}
