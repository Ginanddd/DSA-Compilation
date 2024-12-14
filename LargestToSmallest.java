import java.util.*;
public class LargestToSmallest
{
   public void run(){
      Scanner keyboard = new Scanner(System.in);
      int x, y, z;
      
      System.out.println("Enter 3 numbers:");
      x = keyboard.nextInt();
      y = keyboard.nextInt();
      z = keyboard.nextInt();      
            
      if(y > x)
         x = y;
         
      if(z > x)
         x = z;
         
      System.out.println("Largest among the three: " + x);     
      System.out.println("Going back to main menu...");
   }
}