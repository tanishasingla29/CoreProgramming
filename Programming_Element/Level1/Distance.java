import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: distance in feet
        System.out.print("Enter your height in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Convert feet to inches and centimeters
        double distanceInInches = distanceInFeet * 12;
        double distanceInCm = distanceInInches * 2.54;

        // Convert feet to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Output
        System.out.println("Your Height in cm is " + distanceInCm +
                " while in feet is " + distanceInFeet +
                " and inches is " + distanceInInches);


    }
}
