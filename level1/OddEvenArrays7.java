import java.util.Scanner;

public class OddEvenArrays7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: input is not a natural number.");
            scanner.close();
            return;
        }

        int maxSize = number / 2 + 1;
        int[] even = new int[maxSize];
        int[] odd = new int[maxSize];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        System.out.println("\nEven numbers up to " + number + ":");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\nOdd numbers up to " + number + ":");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        scanner.close();
    }
}
