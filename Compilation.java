
import java.util.*;

public class Compilation {
   static Scanner scan = new Scanner(System.in);
   public static void main (String[] args) {
      String choice = "";
      do {
         System.out.println("--- Compilation Menu ---");
         System.out.println("[1]: Activity 1 -- Product and Sum of 10 Numbers\n[2]: Activity 2 -- Display Odd and Even Integer in Order");
         System.out.println("[3]: Activity 3 -- Node List Menu\n[4]: Activity 4 -- Queue Array Menu\n[5]: Activity 5 -- Queue Node Menu");
         System.out.println("[6]: Activity 6 -- Stack Array Menu\n[7]: Activity 7 -- Stack List Menu\n[8]: Activity 8 -- Infix To Postfix Menu");
         System.out.println("[9]: Largest to Smallest Number\n[10]: No Duplicates\n[11]: Max Number\n[12]: Quit");
         System.out.print("Enter choice: ");
         choice = scan.nextLine().trim();
         
         switch(choice) {
            case "1":
               ActivityOne actOne = new ActivityOne();
               actOne.run();
               break;
            case "2":
               ActivityTwo actTwo = new ActivityTwo();
               actTwo.run();
               break;
             case "3":
               NodeMenu nodeMenu = new NodeMenu();
               nodeMenu.run();
               break;
             case "4":
               QueueMenu queueArray = new QueueMenu();
               queueArray.run();
               break;
             case "5":
               QueueNodeMenu queueNode = new QueueNodeMenu();
               queueNode.run();
               break;
             case "6":
               StackArrayMenu sam = new StackArrayMenu();
               sam.run();
               break;
            case "7":
               StackListMenu slm = new StackListMenu();
               slm.run();
               break;
            case "8":
               InfixToPostfix itp = new InfixToPostfix();
               itp.run();
               break;
            case "9":
               LargestToSmallest ln = new LargestToSmallest();
               ln.run();
               break;
            case "10":
               NoDuplicates nd = new NoDuplicates();
               nd.run();
               break;
            case "11":
               MaxNumber mn = new MaxNumber();
               mn.run();
               break;
            case "12":
               System.out.println("Thank you for using the menu!");
               break;
            default:
               System.out.println("Invalid Input!");
               break;
            

               
         }
      }while (!choice.equals("12"));
   }
}