import java.util.Scanner;

public class ActivityTwo {
    public void run() {
        Scanner scan = new Scanner(System.in);
        int[] even = new int[10];
        int[] odd = new int[10];
        int evenCounter = 0, oddCounter = 0;

        System.out.print("Enter 10 Integers: ");
        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();

            if (num % 2 == 0) {
                even[evenCounter++] = num;
            } else {
                odd[oddCounter++] = num;
            }
        }

        System.out.println("Even\t\t\tOdd");
        for (int i = 0; i < Math.max(evenCounter, oddCounter); i++) {
            if (i < evenCounter) {
                System.out.print(even[i]);
            } else {
                System.out.print("");
            }

            System.out.print("\t\t\t");

            if (i < oddCounter) {
                System.out.println(odd[i]);
            } else {
                System.out.println();
            }
        }

        System.out.println("Going back to main menu...");
    }
}
