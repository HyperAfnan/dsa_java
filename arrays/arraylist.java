import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
   public static void main(String[] args) {
      /*
       * An ArrayList is like an array but we don't have to define its size to work
       * with it
       * 
       * Syntax:
       * 
       * ArrayList<datatype you want to store> list = new ArrayList<>(initial capacity
       * of the arraylist);
       * You have to use wrapper classes in the datatype section you can't use
       * generics in the datatype section
       * 
       * it does not cause any error if the arraylist's size get more than its initial
       * 
       * Internally when a list is created it has given the size of the initial
       * capacity but when x% of the list is filled it creates a copy of list of
       * double size and shifts all the elements into the new list and deletes the
       * original list capacity
       */
      ArrayList<Integer> list = new ArrayList<>(10);

      /*
       * list.add(34);
       * list.add(4);
       * list.add(3);
       * list.add(24);
       * list.add(324);
       * list.add(340);
       * list.add(344);
       */

      /* It does not need a toString() method to get its values */
      /*
       * // System.err.println(list);
       * // System.err.println(Arrays.toString(list.toArray()));
       * returns same output
       */

      // System.err.println(list.contains(34)); // returns true coz 34 is in the list

      // list.set(0, 99); // change value at any index now the list is like this [99,
      // 4, 3, 24, 324, 340, 344]

      // list.remove(6); // removes the index from the list
      // now the list is like this [34, 4, 3, 24, 324, 340]

      // taking input into the list
      /*
       * Scanner in = new Scanner(System.in);
       * 
       * for (int i = 0; i < 9; i++) {
       * list.add(in.nextInt());
       * }
       * System.err.println(list);
       * in.close();
       */

   }
}
