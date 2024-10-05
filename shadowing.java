public class shadowing {
   static int x = 60;

   public static void main(String[] args) {

      // This is called shadowing, changing of variable according to scope
      System.out.println(x); // returns 60
      int x = 40;
      System.out.println(x); // returns 40

      fun();
      /*
       * returns 60 again coz the x declared in current function is in another scope
       * and according to the scope of class shadowing its value is 60
       */


      /*
       * Fun Fact:
       * int x;
       * System.out.println(x);
       * returns error coz their is no value assigned to x and its scope is not
       * started yet
       */
   }

   static void fun() {
      System.out.println(x);
   }
}
