public class IsPallindrome {
    public static void main(String[] args) {
        String str = "NITIN";
        if (palindrome(str, 0, str.length()-1 )) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

    public static boolean palindrome(String str, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }
        return palindrome(str, i + 1, j - 1);
    }
}
