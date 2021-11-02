abstract class Display {
   private abstract void display();
}
 
public class Main extends Display {
    void display() {
         System.out.println("Inside display method");
    }
   public static void main(String args[]) {
     System.out.println("Inside main class");
   }
}