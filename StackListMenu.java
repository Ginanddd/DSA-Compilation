
import java.util.Scanner;

public class StackListMenu {
    static Scanner scan = new Scanner(System.in);
    static StackList sl = new StackList();
    public void run () {
        String choice = "";

        do {
            System.out.println("--- Stack List Menu ---");
            System.out.println("[1]: Push\n[2]: Pop\n[3]: Peek\n[4]: Size\n[5]: Display\n[6]: Exit");
            System.out.print("Enter choice: ");
            choice = scan.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter a value: ");
                    String val = scan.nextLine();
                    
                    sl.push(val);
                    System.out.println("Pushed Successfully.");
                    break;
                case "2":
                    System.out.println((sl.pop() == null) ? "Stack is Empty" : "Popped Successfully.");
                    break;
                case "3":
                    Object peek = sl.peek();
                    System.out.println((peek == null) ? "Stack is Empty" : "Peek: " + peek );
                 break;
                case "4":
                    System.out.println("Size: "+ sl.size());
                    break;
                case "5":
                    sl.display();
                    break;
                case "6":
                    System.out.println("Going back to main menu...");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (!choice.equalsIgnoreCase("6"));
    }
}
