import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter a word or phrase: ");
        String userInput = scanner.nextLine();

        if (isPalindrome(userInput)) {
            System.out.println("\"" + userInput + "\" is a palindrome!");
        } else {
            System.out.println("\"" + userInput + "\" is NOT a palindrome.");
        }

        scanner.close();
    }

}