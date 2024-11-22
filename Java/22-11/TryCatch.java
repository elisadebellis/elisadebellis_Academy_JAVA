public class TryCatch {

    public static void main(String[ ] args) {
  
        try {

            int[] myNumbers = {1, 2, 3, 4};
      
            System.out.println(myNumbers[12]);
      
          } catch (Exception e) {
      
            System.out.println("Qualcosa non è andato.");
            //viene eseguito anche se entra nel catch
          } finally {
      
            System.out.println("il 'try catch' è finito.");
      
          }}


          static void checkAge(int age) {
            if (age < 18) {
                // creare errore personalizzato 
              throw new ArithmeticException("Access denied - You must be at least 18 years old.");}
            else {
              System.out.println("Access granted - You are old enough!"); }}
 
}