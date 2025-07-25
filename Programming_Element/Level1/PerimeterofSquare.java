import java.util.Scanner;

public class PerimeterofSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        float side = sc.nextFloat();
        int PerimeterofSquare = (int) (4 * side);
        System.out.println("The length of the side is " + side + "whose perimeter is " + PerimeterofSquare);
    }
}
