public class searchIn2Darry {
   public static void main(String[] args) {
      int num[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
      int t = 4;
      String ans = search(num , t);
      System.out.println(ans);
   }

   private static String search(int[][] array, int t) {
      if (array.length == 0) {
         return "No Arrray";
      }
      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[i].length; j++) {
            if (array[i][j] == t) {
               return "Placed at " + i + " row and " + j + " column";
            }
         }
         
      }
      return "Not Found";
   }

}
