import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and height in inches
        System.out.print("Enter the base of the triangle in inches: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double height = sc.nextDouble();

        // Area in square inches
        double areaInInches = 0.5 * base * height;

        // 1 inch = 2.54 cm => 1 sq inch = 6.4516 sq cm
        double areaInCm = areaInInches * 6.4516;

        // Convert height into cm, feet, and inches
        double heightInCm = height * 2.54;
        double heightInFeet = height / 12;
        double heightInInches = height;

        // Output
        System.out.println("Area of triangle is: " + areaInInches + " sq.inches and " + areaInCm + " sq.cm");
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and in inches is " + heightInInches);
    }
}
