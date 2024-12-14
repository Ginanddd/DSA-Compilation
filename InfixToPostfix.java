import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix{
    static Scanner scan = new Scanner(System.in);
    public static String convert(String equation){
        String postfix = "";
        String num = "";
        Stack <Character> container = new Stack<>();

        for(int i = 0; i < equation.length(); i++){
            char ch = equation.charAt(i);

            if(ch == ' '){
                continue;
            }

            if(Character.isDigit(ch)){
                num += ch;
            }else{
                if(!num.isEmpty()){
                    postfix += num + " ";
                    num = "";
                }

                switch (ch) {
                    case '(':
                        container.push(ch);
                        break;
                    case ')':
                        while (!container.isEmpty() && container.peek() != '(') {
                            postfix += container.pop() + " ";
                        }
                        if (!container.isEmpty()) {
                            container.pop(); // Remove the '(' from the stack
                        }
                        break;
                    default:
                    while(!container.isEmpty() && (prec(ch) < prec(container.peek()) || prec(ch) == prec(container.peek()))){
                            postfix += container.pop() + " ";
                        }   
                        container.push(ch);
                        break;
                }
            }
        }

        if(!num.isEmpty()){
            postfix += num + " ";
        }

        while(!container.isEmpty()){
            postfix += container.pop() + " ";
        }
        return postfix;
    }

    public static double evaluate(String postfix){
        Stack <Double> container = new Stack<>();
        String num = "";
        
        for(int i = 0; i < postfix.length(); i++){
            char ch = postfix.charAt(i);

            if(Character.isDigit(ch)){
                num += ch;
            }else if(ch == ' '){
                if(!num.isEmpty()){
                    container.push(Double.parseDouble(num));
                    num = "";
                }
            }else{
                if(!num.isEmpty()){
                    container.push(Double.parseDouble(num));
                    num = "";
                }

                double b = container.pop();
                double a = container.pop();
                double result = calculate(ch, a, b);
                container.push(result);
            }
        }

        if(!num.isEmpty()){
            container.push(Double.parseDouble(num));
        }

        return container.pop();
    }

    private static int prec(char operator){
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    private static double calculate(char operator, double a, double b){
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if(b == 0){
                    throw new ArithmeticException("Undefined");
                }

                return a / b;
            default:
                return 0;
        }
    }

    public void run() {
        String choice = "";
        String str = "";
        boolean converted = false;
        do {
            System.out.println("--- Infix to PostFix Menu ---");
            System.out.println("[1]: Convert\n[2]: Evaluate\n[3]:Quit");
            System.out.print("Enter your choice: ");
            choice = scan.nextLine().trim();
            
            switch (choice) {
                case "1":
                if (!converted) {
                        System.out.print("Enter Infix Expression: ");
                        String input  = scan.nextLine();
                        
                        str = convert(input);
                        converted = true;
                        System.out.println("Successfully Converted!");
                    } else 
                    System.out.println("Expression is already Converted");
                    break;
                    case "2":
                    if (converted) {
                        System.out.println("The Evaluation is : " + evaluate(str)); 
                        while (true) {
                            System.out.print("Enter another number? [Y/N]: ");
                            String c = scan.nextLine().toUpperCase().trim();
                            if (c.equals("Y")) {
                                choice = "1";
                                converted = false;
                                break;
                            }
                            else if (c.equals("N")) {
                                choice = "3";
                                System.out.println("Going Back To main menu...");
                                break;
                            }
                            else 
                                System.out.println("Invalid Input");
                        }
                    }
                    else
                    System.out.println("Cannot evaluate an infix expression");
                    break;
                    case "3":
                    System.out.println("Going back to main menu...");
                    break;
                    default:
                    System.out.println("Invalid Input!");
                    break;

                    
                    
                } 
            } while (!choice.equals("3"));
    }
}