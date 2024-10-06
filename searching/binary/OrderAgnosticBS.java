public class OrderAgnosticBS {
   /*
    * Order Agnostic Binary Search is a search which decides that the array is
    * sorted in ascending order or in descending order
    */
   public static void main(String[] args) {

      int num[] = { 48, 36, 20, 14, 12, 11, 9, 6, 3, 2 };
      // 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 }
      int t = 48;
      int answer = Search(num, t);
      System.out.println(answer);
   }

   public static int Search(int[] arr, int target) {
      int start = 0;
      int end = arr.length - 1;

      boolean isAcs = arr[start] < arr[end];

      while (start <= end) {

         int mid = start + (end - start) / 2;
         if (target == arr[mid]) {
            return mid;
         }
         if (isAcs) {
            if (target < arr[mid]) {
               end = mid - 1;
            } else if (target > arr[mid]) {
               start = mid + 1;
            }
         } else {
            if (target > arr[mid]) {
               end = mid - 1;
            } else if (target < arr[mid]) {
               start = mid + 1;
            }
         }

      }
      return 0;
   }
}
