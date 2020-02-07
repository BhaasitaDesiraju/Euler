//A palindromic number reads the same both ways. The largest palindrome made
// from the product of two 2-digit numbers is 9009 = 91 × 99.
//  Find the largest palindrome made from the product of two 3-digit numbers.

public class LargestPalindromeProduct {
  public static boolean isPalindrome(int n) {
    int num = n, revNum = 0;
    while(num>0) {
      revNum = revNum*10 + (num%10);
      num =  num/10;
    }

    if(n == revNum) {
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    for(int i=999; i>=900; i--) {
      for(int j=998; j>=900; j--) {
        if(isPalindrome(i*j)) {
          System.out.println(i+" "+j+" "+i*j);
        }
      }
    }
  }
}
