class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int originalNum = x;
        int rev = 0;
        int rem = 0;
        boolean isCorrect = false;
        while (x > 0) {
            rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        if (originalNum == rev) {
            isCorrect = true;
        }
        return isCorrect;
    }

    public static void main(String[] args) {
        int x = 121;
        boolean result = isPalindrome(x);
        if (result) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}

// I got TC O(Log10N)