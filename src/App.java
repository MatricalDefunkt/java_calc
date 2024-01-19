import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int op1;
        int op2;

        // get input using scanner

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first operand: ");
        op1 = scanner.nextInt();

        System.out.print("Enter second operand: ");
        op2 = scanner.nextInt();

        scanner.close();

        Calculator calc = new Calculator(op1, op2);

        calc.add();
        System.out.println(calc.getResult());
        calc.subtract();
        System.out.println(calc.getResult());
        calc.multiply();
        System.out.println(calc.getResult());
        calc.divide();
        System.out.println(calc.getResult());
    }
}