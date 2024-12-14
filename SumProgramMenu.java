
import java.util.Scanner;

public class SumProgramMenu {
    static Scanner scan = new Scanner(System.in);
    public void run () {
        String choice = "";
        do { 
            System.out.println("--- Sum Program Menu ---");
            System.out.println("[1]: Start Program\n[2]: Exit");
            System.out.print("Enter choice: ");
            choice = scan.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter two integers: ");
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    System.out.println("The sum of the numbers is: " + (num1 + num2));
                    break;
                case "2":
                    System.out.println("Going back to main menu...");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (!choice.equalsIgnoreCase("2"));
    }
}
