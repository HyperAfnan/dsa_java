public class methodOverloading {
   public static void main(String[] args) {
      fun(1, 2); // calls the first function
      fun("FUN"); // calls the second function
      /* fun(); throws error coz no arg is passed, passing args is important */
   }

   /*
    * Declaration of two or more functions with same name but with a different rgs
    * for this to work either the number of args should be different or the type of
    * argument
    */

   public static void fun(int a, int b) {
      System.out.println(a + b);
   }

   public static void fun(String c) {
      System.out.println(c);
   }
}
