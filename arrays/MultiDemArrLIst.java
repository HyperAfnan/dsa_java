import java.util.ArrayList;
import java.util.Scanner;

public class MultiDemArrLIst {
   public static void main(String[] args) {
      // Initialization of a 2d array
      ArrayList<ArrayList<Integer>> list = new ArrayList<>();
      for (int i = 0; i < 3; i++) {
         list.add(new ArrayList<>());
      }

      Scanner in = new Scanner(System.in);
      // Adding elements
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            list.get(i).add(in.nextInt());
         }
      }
      System.err.println(list);
      in.close();
   }
}
