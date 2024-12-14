
import java.util.Scanner;



public class QueueMenu {
    static Scanner scan = new Scanner(System.in);
    public void run() {
        QueueArray qarr;
        int size = 0;
        String choice = "";
        
        while (size <= 0) {
            System.out.print("Enter Size: ");
            size = scan.nextInt();

            if (size <= 0)
                System.out.println("Size cannot be less than or equal to Zero!");
                
            scan.nextLine();
        }
        qarr = new QueueArray(size);
        do {
            System.out.println("--- Queue Menu ---");
            System.out.println("1.) Enqueue\n2.) Dequeue\n3.) Display\n4.) Front\n5.) Exit");
            System.out.print("Enter choice: ");
            choice = scan.nextLine().trim();

            switch (choice) {
                case "1":
                    if (qarr.isFull()) {
                        System.out.println("Queue is full");
                        break;
                    } 
                    System.out.print("Enter value: ");
                    String val = scan.nextLine();

                    qarr.enqueue(val);

                    System.out.println("Added Successfully");
                    break;
                case "2":
                    System.out.println(qarr.dequeue() ? "Removed Successfuly" : "Queue is Empty");
                    break;
                case "3":
                    System.out.println(qarr);
                    break;
                case "4":
                    System.out.println(qarr.isEmpty() ? "Queue is Empty..." : "Front: " + qarr.front());
                    break;
                case "5":
                    System.out.println("Going back to main menu...");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (!choice.equals("5"));

    }   
}
