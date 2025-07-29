import java.util.Scanner;

public class ArrayInputSum4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 positive numbers (enter 0 or a negative to stop):");

        while (true) {
            System.out.print("Enter number #" + (index + 1) + ": ");
            double input = scanner.nextDouble();

            // Stop if user enters 0 or negative
            if (input <= 0) {
                System.out.println("Stopping input as 0 or negative number was entered.");
                break;
            }

            
            arr[index] = input;
            index++;

            
            if (index >= arr.length) {
                System.out.println("Reached maximum of 10 entries.");
                break;
            }
        }

       
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }

     
        System.out.println("\nSum of entered numbers = " + total);

        scanner.close();
    }
}

