import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println("enter in two numbers");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        scan.nextLine();

        System.out.println("would you like to do Addition | Subtraction | Multiplication | Division?");
        String cmd = scan.nextLine();
        double t;

        switch (cmd.toLowerCase()) {
            case "addition":
                t = x + y;
                System.out.println("Result: " + t);
                break;
            case "subtraction":
                t = x - y;
                System.out.println("Result: " + t);
                break;
            case "multiplication":
                t = x * y;
                System.out.println("Result: " + t);
                break;
            case "division":
                if (y == 0) {
                    System.out.println("Error: Divide by Zero");
                } else {
                    t = x / y;
                    System.out.println("Result: " + t);
                }
                break;
            default:
                System.out.println(cmd + " is not an option");
                break;
        }
    }
}
