import java.util.Scanner;

public class FootballTeamMeanHeight6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] heights = new double[11];
        double total = 0.0;

        System.out.println("Enter the heights of 11 players (in, e.g., centimeters):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player #" + (i + 1) + " height: ");
            heights[i] = scanner.nextDouble();
        }

       
        for (double h : heights) {
            total += h;
        }

     
        double mean = total / heights.length;

        
        System.out.printf("\nMean height of the football team: %.2f\n", mean);

        scanner.close();
    }
}

