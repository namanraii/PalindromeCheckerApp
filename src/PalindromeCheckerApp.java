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

        // UC5: Stack-based palindrome check
        String inputUC5 = "madam";
        java.util.Stack<Character> stack = new java.util.Stack<>();

// Push characters into stack
        for (char c : inputUC5.toCharArray()) {
            stack.push(c);
        }

// Pop and compare
        boolean isPalindrome = true;
        for (char c : inputUC5.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(inputUC5 + (isPalindrome ? " is a palindrome." : " is NOT a palindrome."));
    }
}