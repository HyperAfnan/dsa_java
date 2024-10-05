public class linear_with_strings {
   public static void main(String[] args) {
      String array[] = {"Afnan", "Ammu", "Papa", "Mummy"};
      String var = "Afna"; // variable to Find
      String answer = linearinarray(array, var);
      System.out.println(answer);
   }

   private static String linearinarray(String[] array, String var) {
      for (int i = 0; i < array.length; i++) {
         if (array[i] == var) {
            return "FOund";
         }
      }
      return "Not Found";
   }
}
