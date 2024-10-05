package arrays;

public class Main {
   public static void main(String[] args) {
      /*
       * 
       * Array is a collection of data with *same datatype*
       * 
       * 
       * Syntax is like
       * datatype[] variable_name = ( new datatype[size]; ) => this is called dynamic
       * memory allocation, the new thing creates the object in heap memory at runtime
       * and the part before is processed at compile time ie datatype[] variable_name
       * 
       * the "new" is used to create an object though its not important to use new to
       * create object
       * 
       * Its just to declare the array
       * 
       * 
       * or
       * These two are to initialize the array
       * Actual memory creation happens here
       * datatype[] variable_name = {its objects};
       * 
       * 
       * or
       * datatype variable_name[] = {its objects};
       * 
       * 
       * An Array of 5 objects
       * int[] someArray = new int[5];
       * 
       */
      int[] someArray;
      someArray = new int[5];
      // System.out.println(someArray[0]); // returns 0 coz there is no object at 0th
      // index

      String[] someArray1;
      someArray1 = new String[5];
      // System.out.println(someArray1[0]); // returns null in case of string

      /*
       * 
       * String can be null but Int can't be null
       * coz string is an object (it can be broken down into char ) and int is a
       * primative
       * all object can be null
       * Primatives are int, char, boolean , float
       * Objects are string, array , complex datatypes
       * 
       * Primative are stored in stack memory and all the other types like all kinds
       * of objects are stored heap memory
       * 
       * if there is an array of strings ie String someArray = { "Hello", "World",
       * "99" };
       * each string will be considered as an object and it will be stored in
       * different
       * location in the heap memory ie the someArray will be stored in stack memory
       * and the { "Hello", "World", "99" } will be stored in heap memory and the
       * locations of all the string will be different and if we try to access the
       * value at 99th index it returns null
       * 
       */

      int[] arr = new int[5];
      arr[0] = 23;
      arr[1] = 34;
      arr[2] = 56;
      arr[3] = 21;
      arr[4] = 20;
      // can be summed up like this [23, 34,56,21,20]

      // input using for loops
      /*
       * for (int i = 0; i < 5; i++) {
       * int[] arr2 = new int[5];
       * arr2[i] = i;
       * System.out.println(Arrays.toString(arr2));
       * }
       */

      /*
       * 
       * it is called foreach
       * in this code num is referred as the elements in the array
       * it can be used for tasks involving work on an array
       * Can be used for any datatype
       * 
       * for (int num : arr) {
       * System.out.println(num + " "); // returns [23, 34, 56, 21, 20]
       * }
       * we can use Arrays.toString() method instead of this to get all the elements
       * of the array
       * 
       */

      // System.out.println(arr[5]); // returns index out of bound error no value
      // assigned at 5th index it does not
      // returns 0 coz array arr is initialized near its declaration

      /* 2-D Array */

      /*
       * its like an array of arrays
       * Syntax:
       * int some_Array1 = {{1,2,3}, {4,5,6}, {7,8,9}}; Its declaration with
       * Initialization
       * or int[][] arr = new int[3][3]; Its only declaration
       */
      int[][] arr3 = new int[3][3];
      // System.err.println(Arrays.deepToString(arr3)); // use deepToString() method
      // for 2d or any other multi-dimensional array

      /*
       * int[][] arr2d = {
       * { 1, 2, 3 },
       * { 4, 5, 6 },
       * { 7, 8, 9 }
       * };
       * 
       * if we try to get the second index it will return { 7, 8, 9 }
       */

      // Input
      /*
       * Scanner in = new Scanner(System.in);
       * for (int row = 0; row < arr3.length; row++) {
       * for (int column = 0; column < arr3[row].length; column++) {
       * arr3[row][column] = in.nextInt();
       * }
       * }
       * System.err.println(Arrays.deepToString(arr3));
       * in.close();
       */

   }
}
