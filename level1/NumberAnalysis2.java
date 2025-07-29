import java.util.Scanner;

public class NumberAnalysis2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter 5 integers:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        System.out.println("\nAnalysis of each number:");
        for (int n : nums) {
            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println(n + " is positive and even.");
                } else {
                    System.out.println(n + " is positive and odd.");
                }
            } else if (n < 0) {
                System.out.println(n + " is negative.");
            } else {
                System.out.println(n + " is zero.");
            }
        }

        
        int first = nums[0];
        int last = nums[nums.length - 1];
        System.out.println("\nComparing first and last elements:");
        if (first < last) {
            System.out.println(first + " (first) is less than " + last + " (last).");
        } else if (first > last) {
            System.out.println(first + " (first) is greater than " + last + " (last).");
        } else {
            System.out.println(first + " (first) is equal to " + last + " (last).");
        }

        scanner.close();
    }
}
