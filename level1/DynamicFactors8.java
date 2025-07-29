import java.util.Scanner;


public class DynamicFactors8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Error: please enter a positive integer.");
            scanner.close();
            return;
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                
                if (index >= maxFactor) {
                    int newCapacity = maxFactor * 2;
                    int[] temp = new int[newCapacity];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                    maxFactor = newCapacity;
                }
                factors[index++] = i;
            }
        }

        
        System.out.println("\nFactors of " + number + ":");
        for (int j = 0; j < index; j++) {
            System.out.print(factors[j] + (j < index - 1 ? ", " : ""));
        }
        System.out.println();

        scanner.close();
    }
}

