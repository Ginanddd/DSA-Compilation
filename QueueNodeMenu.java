
import java.util.Scanner;


public class QueueNodeMenu {
    public void run() {
        QueueNode qn = new QueueNode();
        Scanner scan = new Scanner(System.in);
        String choice =  "";

        do {
            System.out.println("---Queue Menu---");
            System.out.println("1.Enqueue\n2.Dequeue\n3.Get First\n4.Get Last\n5.Display\n6.Exit");

            System.out.print("Enter choice: ");
            choice = scan.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter value: ");
                    String value = scan.nextLine();

                    System.out.println(qn.enqueue(value) ? "\nAdded Successfully\n" : "Error");
                    break;
                case "2":
                    System.out.println(qn.dequeue() ? "Removed Successfully " : "Queue is Empty...");
                    break;
                case "3":
                    System.out.println(qn.getFirst() == null ? "Queue is Empty..." : "First = " + qn.getFirst());
                    break;
                case "4":
                    System.out.println(qn.getLast() == null ? "Queue is Empty..." : "Last = " + qn.getLast());
                    break;
                case "5":
                    System.out.println(qn);
                    break;
                case "6":
                    System.out.println("Going back to main menu...");
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }

        } while (!choice.equals("6"));
    }
}
