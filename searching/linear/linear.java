// Search for a character in a string
public class linear {
   public static void main(String[] args) {
      String str = "Afnan";
      char t = 'n';
      String answer = linearinstring(str, t);
      System.out.println(answer);
   }

   private static String linearinstring(String str, char target) {
      for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == target) {
            return "Found at index " + i;
         }
      }
      return "Not found";
   }
}
