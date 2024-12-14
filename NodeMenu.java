import java.util.Scanner;

public class NodeMenu {
   static Scanner scan = new Scanner(System.in);
   static NodeList nl = new NodeList();
   public void run () {
      String choice = "";

      do {
         System.out.println("--- Node List Menu ---");
         System.out.println("1.Add\n2.Delete\n3.Display\n4.Exit");
         System.out.print("Enter choice: ");

         choice = scan.nextLine().trim();

         switch (choice) {
             case "1":
               System.out.print("Enter Value: ");
               String val = scan.nextLine();
               nl.add(new Node(val));
               break;
            case "2":
            if (nl.isEmpty()) {
               System.out.println("List is empty");
               break;
            }
               nl.display();
               System.out.print("Enter location you want to delete: ");
               int loc = scan.nextInt();

               System.out.println((nl.delete(loc)) ? "Successfully Deleted" : "Invalid Location");
               scan.nextLine();
               break;
            case "3":
               nl.display();
               break;
            case "4":
               System.out.println("Going back to main menu...");
               break;
             default:
                 System.out.println("Invalid Input");
                 break;
         }
         
      } while (!choice.equalsIgnoreCase("4"));
   }
}