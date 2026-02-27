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

        // UC4: Character array based palindrome check
        String inputUC4 = "radar";
        char[] chars = inputUC4.toCharArray();
        boolean isPalindrome = true;
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(inputUC4 + (isPalindrome ? " is a palindrome." : " is NOT a palindrome."));
    }
}