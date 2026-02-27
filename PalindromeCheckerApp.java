package Palindrome_Checker_App;

public class PalindromeCheckerApp {
   public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        boolean isPalindrome = true;

        // Check palindrome
        for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }



        

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
