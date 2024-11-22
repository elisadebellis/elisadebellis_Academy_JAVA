
//classe astratta animal che non verrà mai istanziata 
abstract class Animal {
    public abstract void animalSound() ;
 }
  class Pig extends Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    } }
  class Dog extends Animal {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    } }
  class MainAstrazione {
    public static void main(String[] args) {
   
  
      Animal myPig = new Pig(); 
      Animal myDog = new Dog();  

      myPig.animalSound();
      myDog.animalSound();
   }  }

   // classe astratta per raggruppare metodi correlati con corpi vuoti
   // possiamo avere una SORTA di "ereditarietà multipla"
   // una classe reale e vado a riempirlo con tutte le possibilità tra le
   interface Animale {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)}
   }
  class Pig1 implements Animale {
    public void animalSound() {
      System.out.println("The pig says: wee wee");  }
    public void sleep() {
      System.out.println("Zzz"); }}
  class Main {
    public static void main(String[] args) {
      Pig1 myPig = new Pig1();  
      myPig.animalSound();
      myPig.sleep(); }}
  
   