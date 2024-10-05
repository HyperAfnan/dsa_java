/**
 * scope
 */
public class scope {

   public static void main(String[] args) {
      int a = 69;
      int b = 70;
      /*
       * { } creates a new internal scope
       * if you add int to the second a it will give error coz a can't be initialized
       * twice but it can be changed
       * 
       * 
       * anything defined outside { } can be used inside but anything defined inside
       * can't be used outside
       */
      {
         /* values assigned in this block will remain in this block */
         a = 60;
         int c = 40;
         System.out.println(a); // returns 60
         System.out.println(c);
      }
      /*
       * System.out.println(c);
       * this will throw error coz c is not in the same scope
       */

      System.out.println(a); // returns 69
      System.out.println(b);

      /* Loops have their own scope */
   }
}
