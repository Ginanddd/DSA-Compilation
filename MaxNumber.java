import java.util.Scanner;

public class MaxNumber {
    public void run() {
        Scanner scan = new Scanner(System.in);

        int x;
        int max;
        int count = 1;

        System.out.println("Enter 10 numbers: ");
        max = scan.nextInt();

        while(count < 10){
            x = scan.nextInt();
            max = x > max? x: max;
            count++;
        }

        System.out.println("Max: " + max);
        System.out.println("Going back to main menu...");
    }
}