public class PalindromeCheckerApp {

    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "Version 1.0";

    public static void main(String[] args) {

        // UC1: Welcome message
        System.out.println("=====================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(VERSION);
        System.out.println("=====================================");
        System.out.println("Application is ready to check palindromes...");

        // UC7: Deque-based optimized palindrome check
        String inputUC7 = "racecar";
        java.util.Deque<Character> deque = new java.util.LinkedList<>();

// Insert characters into deque
        for (char c : inputUC7.toCharArray()) {
            deque.addLast(c);
        }

// Remove first & last, compare until empty
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(inputUC7 + (isPalindrome ? " is a palindrome." : " is NOT a palindrome."));
    }
}