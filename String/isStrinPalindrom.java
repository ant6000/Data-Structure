public class isStrinPalindrom {
    // iterative approch using string buiilder
    public static boolean isPalindrom1(String word) {
        var input = new StringBuilder(word);
        input.reverse();
        return input.toString().equals(word);
    }
    // two pointer approach
    public static boolean isPalindrom(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right)
            if (word.charAt(left++) != word.charAt(right--))
                return false;
        return true;
    }
}

