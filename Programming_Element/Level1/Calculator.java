import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The value of number1: ");
        int number1 = sc.nextInt();
        System.out.print("The value of number2: ");
        int number2 = sc.nextInt();
        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        System.out.println("For number1 = " + number1 + " and number2 = " + number2 +
                ": Addition = " + addition + ", Subtraction = " + subtraction +
                ", Multiplication = " + multiplication + ", Division = " + division);
            }
}
