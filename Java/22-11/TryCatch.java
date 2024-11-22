public class TryCatch {

    public static void main(String[ ] args) {
  
      try {
  
        int[] myNumbers = {1, 2, 3, 4};
  
        System.out.println(myNumbers[12]);
        System.out.println(myNumbers[3]);
  
      } catch (Exception e) {
  
        System.out.println("Qualcosa non è andato.");
  
    }}}