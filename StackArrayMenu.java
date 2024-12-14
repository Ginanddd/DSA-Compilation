import java.util.Scanner;

public class StackArrayMenu {
    static Scanner scan = new Scanner(System.in);

    public void run() {
        String choice = "";
        System.out.print("Enter Size: ");
        int size = scan.nextInt();

        StackArray stkArr = new StackArray(size);

        scan.nextLine();
        do {
            System.out.println("--- Stack Array Menu ---");
            System.out.println("[1]: Push\n[2]: Pop\n[3]: Peek\n[4]: Display\n[5]: Quit");
            System.out.print("Enter Choice: ");
            choice = scan.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter value: ");
                    String val = scan.nextLine();
                    System.out.println((stkArr.push(val)) ? "Pushed Successfully" : "Stack is Full");
                    break;
                case "2":
                    System.out.println((stkArr.pop()) ? "Popped Successfully" : "Stack is Empty");
                    break;
                case "3":
                    String peek = stkArr.peek();
                    System.out.println((peek == null) ? "Stack is Empty" : "Peek: " + peek);
                    break;
                case "4":
                    stkArr.display();
                    break;
                case "5":
                    System.out.println("Exiting Stack Array Menu...");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (!choice.equals("5"));
    }
}
