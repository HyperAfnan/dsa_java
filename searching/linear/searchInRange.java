// Search in an array in range 
public class searchInRange {
   public static void main(String[] args) {
      int num[] = {23 ,4,7,33,67,3,56,86,99};
      int t = 99;
      int answer = search(num,t , 1,7);
      System.out.println(answer);
   }
   public static int search(int[] arr, int target, int start, int end) {
      if (arr.length == 0) {
         return 0;
      }
      for (int i = start; i < end; i++) {
         if (arr[i] == target) {
            return i;
         }
      }
      return 0;  
   }
}
