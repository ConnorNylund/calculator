import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println("enter in two whole numbers");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        scan.nextLine();

        System.out.println("would you like to do addition or subtraction?");
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
            default:
                System.out.println(cmd + " is not an option");
                break;
        }
    }

}
