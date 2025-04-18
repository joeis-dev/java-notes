public class Palindrome {
  public static boolean isPalindrome(String str) {
    StringBuilder holder = new StringBuilder(); // Better than StringBuffer for single thread apps (It's not synced)
    for (int i = str.length() - 1; i >= 0; i--) {
      holder.append(str.charAt(i));
    }

    // use .toString() on StringBuilder to use String methods
    return holder.toString().equals(str);
  }

  public static void main(String args[]) {
    System.out.println("Is palindrome?: " + Palindrome.isPalindrome("oro"));
  }
}
