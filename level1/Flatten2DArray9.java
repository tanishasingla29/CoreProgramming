import java.util.Scanner;

public class Flatten2DArray9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int totalElements = rows * cols;
        int[] flatArray = new int[totalElements];
        int index = 0;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flatArray[index++] = matrix[i][j];
            }
        }

 
        System.out.println("\nFlattened array:");
        for (int k = 0; k < flatArray.length; k++) {
            System.out.print(flatArray[k] + (k < flatArray.length - 1 ? ", " : ""));
        }
        System.out.println();

        scanner.close();
    }
}
