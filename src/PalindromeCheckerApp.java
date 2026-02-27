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

        // UC6: Queue + Stack based palindrome check
        String inputUC6 = "level";
        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack = new java.util.Stack<>();

// Enqueue and push characters
        for (char c : inputUC6.toCharArray()) {
            queue.add(c);   // FIFO
            stack.push(c);  // LIFO
        }

// Compare dequeue vs pop
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(inputUC6 + (isPalindrome ? " is a palindrome." : " is NOT a palindrome."));
    }
}