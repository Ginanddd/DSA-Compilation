import java.util.Scanner;

public class ActivityOne {
    public void run() {
        Scanner scan = new Scanner(System.in);
        int input, sum = 0, product = 1, i = 0;

        System.out.print("Enter 10 integers (Greater Than Zero): ");
        while (i < 10) {
            input = scan.nextInt();
            if (input > 0) {
                sum += input;
                product *= input;
            } else {
                System.out.println("Input must be greater than zero. Please try again.");
                continue;
            }
            i++;
        }

        if (sum == 0) {
            product = 0;
        }

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("Going back to main menu...");
    }
}
