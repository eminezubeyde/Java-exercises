public class Main {
    public static void main(String[] args) {
        String x = "Engn";
        if (checkPalindrome(x)) {
            System.out.println(x + ": is palindrome.");
        } else {
            System.out.println(x + ": isn't palindrome.");
        }
    }


    private static boolean checkPalindrome(String palindrome) {
        int i, k = palindrome.length() - 1;
        boolean isPalindrome = true;
        for (i = 0; i < palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(k)) {
                isPalindrome = false;
            }
            k--;
        }
        return isPalindrome;
    }


}